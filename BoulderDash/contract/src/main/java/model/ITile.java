package model;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public interface ITile {


	void render(Graphics g, int x, int y, ImageObserver observer);
	

	boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
	

	

}