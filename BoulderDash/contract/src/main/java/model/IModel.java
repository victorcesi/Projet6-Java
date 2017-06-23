package model;

import java.awt.image.BufferedImage;
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


    
	public char[][] transfoTab() throws SQLException;
	
	public void drawTexture(char c, ArrayList<ITile> mobile);
	
	public ArrayList putInArrayList();
	
	public ArrayList<ITile> getMobile();
	
	public void setHEIGTH(int HEIGTH);
	
	public int getHEIGTH();
	
	public void setWIDTH(int WIDTH) ;
	
	/**
	 * Get the char table
	 * @return
	 */
	char[][] getTab();
	
	public BufferedImage load(String path);
	/**
	 * Get the tile
	 * @return
	 */
	public BufferedImage getTile();
	/**
	 * Get the sandTile
	 * @return
	 */
	public ITile getSand();
	/**
	 * Get the dirtTile
	 * @return
	 */
	public ITile getDirt();
	/**
	 * Get the wallTile
	 * @return
	 */
	public ITile getWall();
	/**
	 * Get the stoneTile
	 * @return
	 */
	public ITile getStone();
	/**
	 * Get the diamondTile
	 * @return
	 */

	public ITile getDiamond();

	
	
    
}
