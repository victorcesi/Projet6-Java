

package main;


import controller.Controller;
import model.IModel;
import model.ImageManager;
import model.Map;
import model.ModelFacade;
import view.IView;
import view.ViewFacade;

import java.awt.image.BufferedImage;
import java.sql.SQLException;

/**
 * <h1> the Class Main.</h1>
 *
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 */


public abstract class Main {
    private static BufferedImage spriteSheet;


    public void init() {

    }

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws SQLException
     */
    public static void main(final String[] args) throws SQLException {

        IModel model = new ModelFacade();


        //IController controller = new Controller();

        Controller keyManager = new Controller(model);

        ImageManager im = null;
        new ViewFacade("BoulderDash", model, null, new Map(model), keyManager);
    }
}
