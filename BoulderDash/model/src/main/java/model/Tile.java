package model;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

/**
 * 
 * @author 
 * @version 4.6.3
 *
 */
public abstract class Tile implements ITile {
	protected static ImageManager im;
	

	
	/**
	 * Constructor of the class
	 * @param im
	 */
	public Tile(ImageManager im){
		this.im = im;
	}
	
	
	@Override
	public abstract void render(Graphics g, int x, int y, ImageObserver observer);
}
