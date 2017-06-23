package view;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import model.IMap;
import model.IModel;


/**
 * 
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * 
 * This class will contain the Frame of the game
 */


public class GameFrame extends JFrame  {

	private static final long serialVersionUID = 3880460175055587876L;

	private JFrame frame;
	private GraphicsBuilder graphicsBuilder;
	
	private final IModel model;
	
	private String title;
	private int width, height;
	
	/**
	 * Constructor of the class
	 * @param title
	 * @param model
	 * @param observable
	 * @param map
	 */
	public GameFrame(final String title,IModel model,  final Observable observable, IMap map){
		frame = new  JFrame(title);	
		this.model = model;
		char[][] tab = model.getTab();
		GraphicsBuilder graphicsBuilder = new GraphicsBuilder(tab, map);
		 	
		  
	        frame.setSize(640, 640);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);
	        //frame.addKeyListener((KeyListener) frame);
	        frame.setLocationRelativeTo(null);
	        
	        final Panel panel = new Panel(graphicsBuilder);
	        panel.setDoubleBuffered(true);
	        //observable.addObserver(panel);
	        frame.setContentPane(panel);
	        frame.setVisible(true);

	}
	

/**
 * 
 * @return
 * 			return the frame
 */

	    public JFrame getFrame(){
	    	return frame;
	    }


}
