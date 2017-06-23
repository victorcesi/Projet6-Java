package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Animation {

	
private BufferedImage[] images;	
private int interval, i;
private long timer, now, lastTime; 

public Animation(BufferedImage[] images, int interval){
	
	this.images = images;
	this.interval = interval;
	i = 0;
	timer = 0;
	now = 0;
	lastTime = System.currentTimeMillis();
}
public void tick(){
now	= System.currentTimeMillis();
timer += now -lastTime;
lastTime = now;

if(timer >= interval){
	i ++;
	timer=0;
	if(i >= images.length){
		i = 0;
	}
	
}
}
public void render(Graphics g , int x, int y, int width, int height){
g.drawImage(images[i], x, y, width, height, null);	
}
	
	
	
	
}
