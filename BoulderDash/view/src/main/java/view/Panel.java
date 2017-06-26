package view;


import java.awt.Color;
import java.awt.Graphics;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import model.Example;
import model.IModel;

/**
 * 
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * 
 * This class will contain the Panel of the game
 *
 */
public class Panel extends JPanel implements Observer{

	
	private static final long serialVersionUID = 2420761384684270293L;
	private final IGraphicsBuilder graphicsBuilder;
	
	/**
	 * Constructor of the class
	 * @param graphicsBuilder
	 */
	public Panel(final GraphicsBuilder graphicsBuilder){
		this.graphicsBuilder = graphicsBuilder;
		this.setDoubleBuffered(true);
	}

/**
 * @param  g
 * This method calls the method applyModelToGraphic to paint the map in the Panel
 */
	public void paintComponent(Graphics g){
		
		this.graphicsBuilder.applyModelToGraphic(g, this);
		this.graphicsBuilder.drawPlayer(g, this);
		repaint();
		
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}
			
}