package model;

import java.awt.Graphics;

/**
 * 
 * @author 
 * @version 4.6.3
 * 
 * This abstract class contains tiles which are entities (they aren't static)
 */

public abstract class Entity {

	protected float x, y;
	
protected int width, height;
	
/**
 * 
 * @param x
 * 			x position of the entity
 * @param y
 * 			y position of the entity
 * @param width
 * 				width of the entity
 * @param height
 * 				height of the entity
 */
	public Entity(float x, float y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public abstract void tick();
	/**
	 * 
	 * @param g
	 */
	public abstract void render(Graphics g);
	
	public float getX() {
		return x;
	}
/**
 * 
 * @param x
 */
	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}
/**
 * 
 * @param y
 */
	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}
/**
 * 
 * @param width
 */
	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}
/**
 * 
 * @param height
 */
	public void setHeight(int height) {
		this.height = height;
	}

	
}
