package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * This class load the path of the file which contains all the tiles
 */
public class ImageLoader{

	public BufferedImage load(String path){
		try{
			return ImageIO.read(new File(path));
		}catch (IOException e){
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
