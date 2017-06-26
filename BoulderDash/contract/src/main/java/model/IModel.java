package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {


    
	char[][] transfoTab() throws SQLException;
	
	ArrayList putInArrayList();
	
	ArrayList<ITile> getMobile();
	
	void setHEIGTH(int HEIGTH);
	
	int getHEIGTH();
	
	void setWIDTH(int WIDTH) ;
	
	/**
	 * Get the char table
	 * @return
	 */
	char[][] getTab();
	
	BufferedImage load(String path);
	/**
	 * Get the tile
	 * @return
	 */
	/**
	 * Get the sandTile
	 * @return
	 */
	ITile getSand();
	/**
	 * Get the dirtTile
	 * @return
	 */
	ITile getDirt();
	/**
	 * Get the wallTile
	 * @return
	 */
	ITile getWall();
	/**
	 * Get the stoneTile
	 * @return
	 */
	ITile getStone();
	/**
	 * Get the diamondTile
	 * @return
	 */

	ITile getDiamond();
	
	ITile getPlayer();
	
	
	void render(Graphics g, int x, int y, ImageObserver observer);
	
	IMap getMap();
	
}
