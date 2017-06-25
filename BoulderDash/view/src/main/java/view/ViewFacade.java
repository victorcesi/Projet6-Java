package view;

import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import controller.IController;
import controller.IEventPerformer;
import model.IMap;
import model.IModel;
import model.ITile;




/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable {
	
	IModel model;
	private EventPerformer eventPerformer;
	

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade(String title, IModel model, Observable observer, IMap map, IEventPerformer orderPerformer) {
    	this.model = model;
    	this.eventPerformer = new EventPerformer(orderPerformer);
    	GameFrame frame = new GameFrame(title,model, observer, map, eventPerformer);
    }

    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
    @Override
    public final void displayMessage(final String message) {
        JOptionPane.showMessageDialog(null, message);
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeWindow() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawScore(int score) {
		// TODO Auto-generated method stub
		
	}

}
