package map;

import entity.Entity;
import stats.Stats;
import gameobject.GameObject;

public class AreaEffect extends GameObject {
	
	/*--------------------- DATA MEMBERS ---------------------*/
	private Stats modifiers;
	
	/*--------------------- CONSTRUCTORS ---------------------*/
	public AreaEffect(String sprite, String name, String description, Stats mods){
		super(sprite, name, description);
		this.modifiers = mods;
	}
	
	/*--------------------- USAGE ---------------------*/
	public void affect(Entity entity){
		entity.mergeStats(modifiers);
	}
	
	
	
}
