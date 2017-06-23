

package main;


import java.awt.image.BufferedImage;
import java.sql.SQLException;


import controller.Controller;
import controller.IController;
import model.IModel;
import model.ImageLoader;
import model.ModelFacade;
import model.SpriteSheet;
import view.GameFrame;
import view.IView;
import view.Panel;
import view.ViewFacade;
import model.Map;


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
    
    IView view = new ViewFacade("BoulderDash", model, null, new Map(model));
    	
        /*final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());
        

        try {

            controller.start();


        } catch (final SQLException exception) {
            exception.printStackTrace();
        }*/
        
    }
}
