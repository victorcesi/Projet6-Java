package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

/**
 * 
 * @author 
 * @version 4.6.3
 *
 * This class will store the method to draw a diamond tile on the panel
 */
public class DiamondTile extends Tile {
	
	private Animation DiamondAnimation;
	public DiamondTile(ImageManager im){
		super(im);
		DiamondAnimation = new Animation(im.diamonds,200);
	}
	/**
	 * 
	 * @param g
	 * @param x
	 * @param y
	 * 
	 * 
	 */
	/*public void render(Graphics g, int x, int y){
		nomAnimation.render(g, x, y , 16, 16);
	}*/
	@Override
	public void render(Graphics g, int x, int y, ImageObserver observer) {
		// TODO Auto-generated method stub
		DiamondAnimation.render(g, x*16, y*16, 16,16);
	}
	public void tick(){
		DiamondAnimation.tick();
	}
/*	@Override
	public void renderPlayer(Graphics g, int x, int y, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}*/

	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}


}
