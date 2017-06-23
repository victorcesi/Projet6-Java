package model;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface ITile {


	void render(Graphics g, int x, int y, ImageObserver observer);
	

}