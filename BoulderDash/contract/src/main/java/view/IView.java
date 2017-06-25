package view;

import java.awt.event.KeyEvent;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author 
 * @version 4.6.3
 */
public interface IView {

    int width = 0;
    
	void keyPressed(KeyEvent e);

	void keyReleased(KeyEvent e);

	void keyTyped(KeyEvent e);

	/**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    
    void closeWindow();
    
    void drawScore(int score);
}



