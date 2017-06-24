package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
/**
 * 
 * @author 
 * @version 4.6.3
 *
 * This class will store the method to draw a stone tile on the panel
 */
public class StoneTile extends Tile {
/**
 * Constructor of the class
 * @param im
 */
	public Animation StoneAnimation;
	
	public StoneTile (ImageManager im) {
		super(im);
		StoneAnimation = new Animation(im.stoneTile,200);
	}
/**
 * Method to draw the tile
 * @param g
 * @param x
 * @param y
 */
	@Override
	public void render(Graphics g, int x, int y, ImageObserver observer) {
		// TODO Auto-generated method stub
		StoneAnimation.render(g, x*16, y*16, 16,16);
	}
	public void tick(){
		StoneAnimation.tick();
	}
	
	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
