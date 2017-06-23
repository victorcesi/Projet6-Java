package model;

import java.awt.image.BufferedImage;
/**
 * 
 * @author Aurélien POTTIER
 * @version 4.6.3
 * 
 * This class will get the path to access to all the textures which will be stored in ImageManager class
 */

public class SpriteSheet {
	
	private BufferedImage sheet;
	public SpriteSheet(){

		ImageLoader loader = new ImageLoader();
		sheet = loader.load("C:\\Users\\Neros Fast\\git\\Projet-java\\BoulderDash-BaseProject\\BoulderDash\\model\\ressources\\SpriteSheet.png");
	}
	/**
	 * 
	 * @param col
	 * @param row
	 * @param w
	 * @param h
	 * @return  return an image
	 * 			
	 */
	public BufferedImage crop(int col, int row, int w, int h){
		return sheet.getSubimage(col * 16, row * 16, w, h);
	}


}
