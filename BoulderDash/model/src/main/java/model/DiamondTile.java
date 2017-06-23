package model;

import java.awt.Graphics;
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
		DiamondAnimation.render(g, x, y, 16,16);
	}
	public void tick(){
		DiamondAnimation.tick();
	}

}
