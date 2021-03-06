package map;

import entity.MotionType;

public class MotionValidator {
	private static MotionValidator validator = null;
	public static MotionValidator getInstance() {
		if(validator == null) {
			validator = new MotionValidator();
		}
		return validator;
	}

	public boolean canTraverse(MotionType entityMotion, MotionType terrainMotion) {
		System.out.println(entityMotion.toString());
		System.out.println(terrainMotion.toString());
		switch(entityMotion) {
			case GROUND:
				switch(terrainMotion) {
					case GROUND:
						return true;
					case WATER:
						return false;
					case UNATTAINABLE:
						return false;
				}

				return false;
			case WATER:
				switch(terrainMotion) {
					case GROUND:
						return true;
					case WATER:
						return true;
					case UNATTAINABLE:
						return false;
				}

				return false;
			case UNATTAINABLE:
				return false;
		}

		return false;
	}
}