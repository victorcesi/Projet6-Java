package view;

import model.IMap;
import model.IModel;
import model.ITile;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;


/**
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 *          <p>
 *          This class will contain the Frame of the game
 */


public class GameFrame extends JFrame implements KeyListener {

    private static final long serialVersionUID = 3880460175055587876L;

    private JFrame frame;
    private GraphicsBuilder graphicsBuilder;
    private ITile player;
    private final IModel model;

    private String title;
    private int width, height;
    private EventPerformerable eventPerformer;

    /**
     * Constructor of the class
     *
     * @param title
     * @param model
     * @param observable
     * @param map
     */
    public GameFrame(final String title, IModel model, final Observable observable, IMap map, EventPerformerable eventPerformer) {
        frame = new JFrame(title);
        this.model = model;
        this.eventPerformer = eventPerformer;
        char[][] tab = model.getTab();
        frame.addKeyListener(this);
        GraphicsBuilder graphicsBuilder = new GraphicsBuilder(tab, map, model);


        frame.setSize(660, 640);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setLocationRelativeTo(null);
        final Panel panel = new Panel(graphicsBuilder);
        panel.setDoubleBuffered(true);
        //observable.addObserver(panel);
        frame.setContentPane(panel);
        frame.setVisible(true);

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        this.eventPerformer.eventPerform(keyEvent);

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }

    /**
     * @return return the frame
     */

    public JFrame getFrame() {
        return frame;
    }


}
