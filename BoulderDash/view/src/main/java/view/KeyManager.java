package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager extends Panel implements KeyListener, IkeyManager{

	private boolean[] keys;
	
	public KeyManager(String title, int width, int height) {
		super(title, width, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void keyPressed(KeyEvent e) {

		// TODO Auto-generated method stub
		keys[e.getKeyCode()] = true;
		System.out.println("pressed!");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
