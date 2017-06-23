package model;

import java.awt.image.BufferedImage;

/**
 * This class will cut the SpriteSheet to get all different tiles
 * @author  Aurélien Pottier
 * @version 4.6.3
 */
public class ImageManager  {
	private SpriteSheet ss;
	public BufferedImage wallTile, sandTile, dirtTile, wallTileL2, sandTileL2, dirtTileL2, wallTileL3, sandTileL3, dirtTileL3, wallTileL4, sandTileL4, dirtTileL4, wallTileL5, sandTileL5, dirtTileL5;
	public BufferedImage[] player, playerRT, playerLT, stoneTile, diamonds, doorTile, ennemisTile, stoneTileL2, diamondsL2, doorTileL2, ennemisTileL2, stoneTileL3, diamondsL3, doorTileL3, ennemisTileL3, stoneTileL4, diamondsL4, doorTileL4, ennemisTileL4, stoneTileL5, diamondsL5, doorTileL5, ennemisTileL5;
/**
 * Constructor of the class
 * @param ss , level
 * 			The loader of the SpriteSheet , the map that we want to open (1,2,3,4 or 5)
 * 
 */
	public ImageManager(SpriteSheet ss, int level){
		this.ss = ss;
		// We switch the level attribute to load the right Level.
		switch(level){
			case 1: 
				Level1(ss);
				break;
			case 2: 
				Level2(ss);
				break;
			case 3: 
				Level3(ss);
				break;
			case 4:
				Level4(ss);
				break;
			case 5: 
				Level5(ss);
				break;
		}
		
		player = new BufferedImage[3];
		player[0] = ss.crop(0,0,16,16);
		player[1] = ss.crop(0,0,16,16);
		player[2] = ss.crop(0,0,16,16);
		playerRT = new BufferedImage[3];
		playerRT[0] = ss.crop(0,3,16,16);
		playerRT[1] = ss.crop(1,3,16,16);
		playerRT[2] = ss.crop(2,3,16,16);
		playerLT = new BufferedImage[3];
		playerLT[0] = ss.crop(0,1,16,16);
		playerLT[1] = ss.crop(1,1,16,16);
		playerLT[2] = ss.crop(2,1,16,16);
		
	}
		//texture level 1
	/**
	 * 
	 * @param ss
	 * 
	 * These methods will put all textures in a table of tile in order to draw the map
	 */
public void Level1(SpriteSheet ss){
		wallTile = ss.crop(6, 0, 16, 16);
		sandTile = ss.crop(7, 0, 16, 16);
		dirtTile = ss.crop(8, 0, 16, 16);
		
		stoneTile = new BufferedImage[4];
		stoneTile[0] = ss.crop(9,0,16,16);
		stoneTile[1] = ss.crop(9,1,16,16);
		stoneTile[2] = ss.crop(9,2,16,16);
		stoneTile[3] = ss.crop(9,3,16,16);
		
		diamonds = new BufferedImage[4];
		diamonds[0] = ss.crop(10,0,16,16);
		diamonds[1] = ss.crop(10,1,16,16);
		diamonds[2] = ss.crop(10,2,16,16);
		diamonds[3] = ss.crop(10,3,16,16);
		
		doorTile = new BufferedImage[4];
		doorTile[0] = ss.crop(12,0,16,16);
		doorTile[1] = ss.crop(12,1,16,16);
		doorTile[2] = ss.crop(12,2,16,16);
		doorTile[3] = ss.crop(12,3,16,16);
		
		ennemisTile = new BufferedImage[4];
		ennemisTile[0] = ss.crop(15,0,16,16);
		ennemisTile[1] = ss.crop(15,1,16,16);
		ennemisTile[2] = ss.crop(15,2,16,16);
		ennemisTile[3] = ss.crop(15,3,16,16);
		
}
		//textures level 2
	public void Level2(SpriteSheet ss){
		
		wallTile = ss.crop(6, 4, 16, 16);
		sandTile = ss.crop(7, 4, 16, 16);
		dirtTile = ss.crop(8, 4, 16, 16);
		
		stoneTile = new BufferedImage[4];
		stoneTile[0] = ss.crop(9,4,16,16);
		stoneTile[1] = ss.crop(9,5,16,16);
		stoneTile[2] = ss.crop(9,6,16,16);
		stoneTile[3] = ss.crop(9,7,16,16);
		
		diamonds = new BufferedImage[4];
		diamonds[0] = ss.crop(10,4,16,16);
		diamonds[1] = ss.crop(10,5,16,16);
		diamonds[2] = ss.crop(10,6,16,16);
		diamonds[3] = ss.crop(10,7,16,16);
		
		doorTile = new BufferedImage[4];
		doorTile[0] = ss.crop(12,4,16,16);
		doorTile[1] = ss.crop(12,5,16,16);
		doorTile[2] = ss.crop(12,6,16,16);
		doorTile[3] = ss.crop(12,7,16,16);
		
		ennemisTile = new BufferedImage[4];
		ennemisTile[0] = ss.crop(15,4,16,16);
		ennemisTile[1] = ss.crop(15,5,16,16);
		ennemisTile[2] = ss.crop(15,6,16,16);
		ennemisTile[3] = ss.crop(15,7,16,16);
	}
		
		
		//textures level 3
		
	public void Level3 (SpriteSheet ss){
		wallTile = ss.crop(6, 8, 16, 16);
		sandTile = ss.crop(7, 8, 16, 16);
		dirtTile = ss.crop(8, 8, 16, 16);
		
		stoneTile = new BufferedImage[4];
		stoneTile[0] = ss.crop(9,8,16,16);
		stoneTile[1] = ss.crop(9,9,16,16);
		stoneTile[2] = ss.crop(9,10,16,16);
		stoneTile[3] = ss.crop(9,11,16,16);
		
		diamonds = new BufferedImage[4];
		diamonds[0] = ss.crop(10,8,16,16);
		diamonds[1] = ss.crop(10,9,16,16);
		diamonds[2] = ss.crop(10,10,16,16);
		diamonds[3] = ss.crop(10,11,16,16);
		
		doorTile = new BufferedImage[4];
		doorTile[0] = ss.crop(12,8,16,16);
		doorTile[1] = ss.crop(12,9,16,16);
		doorTile[2] = ss.crop(12,10,16,16);
		doorTile[3] = ss.crop(12,11,16,16);
		
		ennemisTile = new BufferedImage[4];
		ennemisTile[0] = ss.crop(15,8,16,16);
		ennemisTile[1] = ss.crop(15,9,16,16);
		ennemisTile[2] = ss.crop(15,10,16,16);
		ennemisTile[3] = ss.crop(15,11,16,16);
		
	}
		
		
		//texture level 4
		
		
		
public void Level4(SpriteSheet ss){
		wallTile = ss.crop(6, 12, 16, 16);
		sandTile = ss.crop(7, 12, 16, 16);
		dirtTile = ss.crop(8, 12, 16, 16);
		
		stoneTile = new BufferedImage[4];
		stoneTile[0] = ss.crop(9,12,16,16);
		stoneTile[1] = ss.crop(9,13,16,16);
		stoneTile[2] = ss.crop(9,14,16,16);
		stoneTile[3] = ss.crop(9,15,16,16);
		
		diamonds = new BufferedImage[4];
		diamonds[0] = ss.crop(10,12,16,16);
		diamonds[1] = ss.crop(10,13,16,16);
		diamonds[2] = ss.crop(10,14,16,16);
		diamonds[3] = ss.crop(10,15,16,16);
		
		doorTile = new BufferedImage[4];
		doorTile[0] = ss.crop(12,12,16,16);
		doorTile[1] = ss.crop(12,13,16,16);
		doorTile[2] = ss.crop(12,14,16,16);
		doorTile[3] = ss.crop(12,15,16,16);
		
		ennemisTile = new BufferedImage[4];
		ennemisTile[0] = ss.crop(15,12,16,16);
		ennemisTile[1] = ss.crop(15,13,16,16);
		ennemisTile[2] = ss.crop(15,14,16,16);
		ennemisTile[3] = ss.crop(15,15,16,16);
}
		
		
		
		//texture level 5
		
		
	public void Level5(SpriteSheet ss){
		wallTile = ss.crop(6, 16, 16, 16);
		sandTile = ss.crop(7, 16, 16, 16);
		dirtTile = ss.crop(8, 16, 16, 16);
		
		stoneTile = new BufferedImage[4];
		stoneTile[0] = ss.crop(9,16,16,16);
		stoneTile[1] = ss.crop(9,17,16,16);
		stoneTile[2] = ss.crop(9,18,16,16);
		stoneTile[3] = ss.crop(9,19,16,16);
	
		diamonds = new BufferedImage[4];
		diamonds[0] = ss.crop(10,16,16,16);
		diamonds[1] = ss.crop(10,17,16,16);
		diamonds[2] = ss.crop(10,18,16,16);
		diamonds[3] = ss.crop(10,19,16,16);
		
		doorTile = new BufferedImage[4];
		doorTile[0] = ss.crop(12,16,16,16);
		doorTile[1] = ss.crop(12,17,16,16);
		doorTile[2] = ss.crop(12,18,16,16);
		doorTile[3] = ss.crop(12,19,16,16);
		
		ennemisTile = new BufferedImage[4];
		ennemisTile[0] = ss.crop(15,16,16,16);
		ennemisTile[1] = ss.crop(15,17,16,16);
		ennemisTile[2] = ss.crop(15,18,16,16);
		ennemisTile[3] = ss.crop(15,19,16,16);
	}

	


}
