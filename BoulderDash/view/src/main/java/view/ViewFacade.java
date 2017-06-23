package view;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JOptionPane;

import model.IMap;
import model.IModel;




/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable {
	
	

    /**
     * Instantiates a new view facade.
     */
    public ViewFacade(String title, IModel model, Observable observer, IMap map) {
    	GameFrame frame = new GameFrame(title,model, observer, map);
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

}
