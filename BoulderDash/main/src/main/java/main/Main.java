

package main;


import java.awt.image.BufferedImage;
import java.sql.SQLException;


import controller.Controller;
import controller.IController;
import model.IModel;
import model.ITile;
import model.ImageLoader;
import model.ModelFacade;
import model.Player;
import model.SpriteSheet;
import view.GameFrame;
import view.IView;
import view.Panel;
import view.ViewFacade;
import model.Map;
import model.ImageManager;

/**
 * <h1> the Class Main.</h1>
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 */


public abstract class Main {
	private static BufferedImage spriteSheet;

	
	public void init(){

	}

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws SQLException 
     */
    public static void main(final String[] args) throws SQLException {
    	
    IModel model = new ModelFacade();
    

    
    //IController controller = new Controller();
    
    ImageManager im = null;
	IView view = new ViewFacade("BoulderDash", model, null, new Map(model));

        
    }
}
