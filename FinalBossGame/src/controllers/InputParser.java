package controllers;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputParser implements KeyListener {
	private SceneControllerDispatcher sceneControllerDispatcher;
	private static final long TIMER_DELAY = 1000;
	private long timerStart;
	
	public InputParser() {
		sceneControllerDispatcher = new SceneControllerDispatcher();
		timerStart = System.currentTimeMillis();
	}
	
	//Not listening for a keyTyped event.
	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(System.currentTimeMillis() - timerStart >= TIMER_DELAY) {
			timerStart = System.currentTimeMillis();
			switch(e.getKeyCode()) {
				case KeyEvent.VK_1 :
					sceneControllerDispatcher.getActiveController().useKey1();
					break;
				case KeyEvent.VK_2 : case KeyEvent.VK_DOWN :
					sceneControllerDispatcher.getActiveController().useKey2();
					break;
				case KeyEvent.VK_3 :
					sceneControllerDispatcher.getActiveController().useKey3();
					break;
				case KeyEvent.VK_4 : case KeyEvent.VK_LEFT : 
					sceneControllerDispatcher.getActiveController().useKey4();
					break;
				case KeyEvent.VK_5 :
					sceneControllerDispatcher.getActiveController().useKey5();
					break;
				case KeyEvent.VK_6 : case KeyEvent.VK_RIGHT : 
					sceneControllerDispatcher.getActiveController().useKey6();
					break;
				case KeyEvent.VK_7 :
					sceneControllerDispatcher.getActiveController().useKey7();
					break;
				case KeyEvent.VK_8 : case KeyEvent.VK_UP : 
					sceneControllerDispatcher.getActiveController().useKey8();
					break;
				case KeyEvent.VK_9 :
					sceneControllerDispatcher.getActiveController().useKey9();
					break;
				case KeyEvent.VK_ENTER :
					sceneControllerDispatcher.getActiveController().useKeyEnter();
					break;
				case KeyEvent.VK_ESCAPE: 
					sceneControllerDispatcher.getActiveController().useKeyEscape();
					break;
				case KeyEvent.VK_I: 
					sceneControllerDispatcher.getActiveController().useKeyI();
					break;
				case KeyEvent.VK_A:
					sceneControllerDispatcher.getActiveController().useKeyA();
					break;
				default : 
					break;
			}
		}
	
		
	}

	public SceneControllerDispatcher getSceneControllerDispatcher() {
		return sceneControllerDispatcher;
	}


	public void setSceneControllerDispatcher(
			SceneControllerDispatcher sceneControllerDispatcher) {
		this.sceneControllerDispatcher = sceneControllerDispatcher;
	}

	//Not listening for a keyReleasedEvent
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	

}
