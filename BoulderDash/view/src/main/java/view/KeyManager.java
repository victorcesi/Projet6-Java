package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager extends Panel implements KeyListener, IkeyManager{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private GameFrame gameFrame;
	 private KeyManager keyManager;
	 private String title;
	    
	 public KeyManager(GraphicsBuilder graphicsBuilder) {
		super(graphicsBuilder);
		// TODO Auto-generated constructor stub
		keyManager = new KeyManager(null);
		gameFrame = new GameFrame(title,null, null, null);
		gameFrame.getFrame().addKeyListener(keyManager);
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
	public KeyManager getKeyManager(){
	    	return keyManager;
	    }
}
