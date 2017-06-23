package model;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.lang.Math;




public class Enemy{
	
	private int a, b, ao, bo, xm, ym;
		
	private float SPEED = 3;
	private final int SIZE = 16;
	private Animation ennemisAnimation1;
	//just for test
	public boolean ft=false, one = false, two=false, three= false;
	
	//public static Ennemis ennemisTileL1 = new Ennemis(16, 16, Game.getImageManager());
	public int j=4;
	public Enemy(int x, int y, ImageManager im){
		
		
		
		ennemisAnimation1 = new Animation(im.ennemisTileL1, 200);
		
		}
	
	public void tick(){
		
	//j = (int) (Math.random() * 5 );   
	//long start=System.nanoTime(); 
	
	
		if(ft==true){
			j=2;
			}
	
	     if(one){
	    	 if(ft==true){
	    			j=2;
	    			}
			if(Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()&& Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()){
			j=3;
			}
			if(Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid() ){
			j=2;
			}
			//droite
			if(Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid()&& Game.getLevel().getTile((ao+xm+a+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid()){
			j=4;
			}
			if(Game.getLevel().getTile((ao+xm+a+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid()&& Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()==false){
			j=1;
			}
		}
	     if(two){
	    	 if(ft==true){
	    			j=2;
	    			}
	    	 if(Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid()){
	    		j=3; 
	    	 }
	    	 if(Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()== false){
	    		j=1 ;
	    	 }
	    	 if(Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()){
	    		j=4; 
	    	 }
	    	 if(Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid()  && Game.getLevel().getTile((ao+xm+a+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid() && Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid()==false ){
	    		 j=2;
	    	 }
	     }
	    
	    		
	
	
	//this switch takes orientation decisions in function of the parameter j
	//a is the horizontal axis and b the vertical axis
	switch(j){
	case 1:
		b -= SPEED;	
		break;
	case 2:
		b += SPEED;	
		break;
	case 3:
		a -= SPEED;	
		break;
	case 4 :
			a += SPEED;
		break;	
	}
	
	
	/*if(Game.getLevel().getTile((ao+xs+a)/ (16*Game.SCALE),(bo+ys+b)/ (16*Game.SCALE) ).isSolid()==true)
	{
	j=4;	
	}	*/

	
	
		
	
	

move(xm, ym);	

	ennemisAnimation1.tick();
	

	
	}
	public void move(int xm, int ym){
	if(!collision(xm,0)){
		ao += xm;
	}
	if(!collision(0,ym)){
		bo += ym;	
	}
	if(collision(xm,ym)){
		
	}
	
	
		
	}
	
	//colisions sensor
	private boolean collision(int xm, int ym){
		//left top sensor
		if (Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid())
			return true;
		//right top sensor
		if (Game.getLevel().getTile((ao+xm+a + SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b)/ (16*Game.SCALE) ).isSolid())
			return true;
		//left bottom sensor
		if (Game.getLevel().getTile((ao+xm+a)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid())
			return true;
		//right bottom sensor
		if (Game.getLevel().getTile((ao+xm+a+ SIZE * Game.SCALE -1)/ (16*Game.SCALE),(bo+ym+b+ SIZE * Game.SCALE -1)/ (16*Game.SCALE) ).isSolid())
			return true;
		
		return false;
		
		
	}
	
	
	public void render(Graphics g){
		
		ennemisAnimation1.render(g, a, b,16 , 16);
		
	}

	
	
	
	
	
	

	
}

public class Enemy {

}
