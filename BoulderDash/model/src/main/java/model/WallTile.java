package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

/**
 * 
 * @author 
 * @version 4.6.3
 *
 * This class will store the method to draw a wall tile on the panel
 */
public class WallTile extends Tile implements ImageObserver {
	private ImageManager im;
	/**
	 * Constructor of the class
	 * @param im
	 */
	public WallTile(ImageManager im){
		super(im);
		this.im = im;
	}
	@Override
	public void render(Graphics g, int x, int y, ImageObserver observer){

		g.drawImage(im.wallTile, x*16, y*16, 16, 16, observer);
	}

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return false;
	}
	




}
