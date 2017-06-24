package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.lang.Object;

public class Player extends Tile implements ITile  {
	
	public Player(ImageManager im) {
		super(im);
		
	}
	public void tick(){
		
	}


	@Override
	public void render(Graphics g, int x, int y, ImageObserver observer) {
		// TODO Auto-generated method stub
		g.drawImage(im.playerTile, x*16, y*16, 16,16, null);
	}



	@Override
	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		// TODO Auto-generated method stub
		return false;
	}

}

