package controller;

import java.awt.event.KeyEvent;

import view.IkeyManager;

public class KeyManager implements IkeyManager{

	private boolean[] keys;
	public boolean up, down, left, right;
	
	public KeyManager(){
		keys = new boolean [256];
	}
	
	public void tick(){
		up  = keys[KeyEvent.VK_Z];
		down  = keys[KeyEvent.VK_S];
		left = keys[KeyEvent.VK_Q];
		right  = keys[KeyEvent.VK_D];
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}