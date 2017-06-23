package model;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import main.Main;


public class Player{
	
	private int [][] tiles;
	private int w, h;
	
	
	private int x, y, xo, yo, xs, ys;
	private ImageManager im; 
	public boolean up = false, dn = false, lt = false, rt = false, sp = false;
	private int SPEED = 6;
	private final int SIZE = 16;
	private Animation LTAnimation, RTAnimation, UpAnimation, DownAnimation;
	
	public Player(int x, int y, ImageManager im){
		this.x = x;
		this.y = y;
		xo = 0;
		yo = 0;
		this.im = im;
		LTAnimation = new Animation(im.playerLT, 200);
		RTAnimation = new Animation(im.playerRT, 200);
		UpAnimation = new Animation(im.player, 250);
		DownAnimation = new Animation(im.player, 200);
		
		}
	
	public void tick(){	
		xs=0;
		ys=0;
	if(up){
		ys -= SPEED;
	}
	else if(dn){
		ys += SPEED;
	}
	if(lt){
		xs -= SPEED;
	}
	else if(rt){
		xs += SPEED;
	}
	if (sp){
		
		if(up){
			ys -= SPEED+2;
		}
		else if(dn){
			ys += SPEED+2;
		}
		if(lt){
			xs -= SPEED+2;
		}
		else if(rt){
			xs += SPEED+2;
		}
		
	}
	SPEED=6;
	

	//move(xs, ys);	
	LTAnimation.tick();
	RTAnimation.tick();
	UpAnimation.tick();
	DownAnimation.tick();
	

	
	}
	/*public void move(int xs, int ys){
	if(!collision(xs,0)){
		xo += xs;
	}
	if(!collision(0,ys)){
		yo += ys;	
	}
	if(collision(xs,ys)){
		
	}
	
	
		
	}*/
	/*private boolean collision(int xs, int ys){
		if (Game.getLevel().getTile((xo+xs+x)/ (16*Game.SCALE),(yo+ys+y)/ (16*Game.SCALE) ).isSolid())
			return true;
		
		if (Game.getLevel().getTile((xo+xs+x + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(yo+ys+y)/ (16*Game.SCALE) ).isSolid())
			return true;
		
		if (Game.getLevel().getTile((xo+xs+x)/ (16*Game.SCALE),(yo+ys+y+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid())
			return true;
		
		if (Game.getLevel().getTile((xo+xs+x+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(yo+ys+y+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid())
			return true;
		
		return false;
		
		
	}*/
	

	
	public void render(Graphics g){
		 
		if(lt)
		{
			LTAnimation.render(g, x, y, 16 , 16);
		}
		
		else if(rt){
			RTAnimation.render(g, x, y, 16 , 16);
		}
		else if(up)
		{
			UpAnimation.render(g, x, y, 16, 16);
		}
		else if(dn) {
			DownAnimation.render(g, x, y, 16, 16);
		}
		
		
		

		else
		{	
			DownAnimation.render(g, x, y, 16 ,16);
			
		}
		
		
	}
	
	

	public int getXo(){
		return xo;
	}
	public int getYo(){
		return yo;
	}
	
	
	
	
	
	

	
}