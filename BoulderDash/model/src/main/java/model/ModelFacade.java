package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import model.dao.ExampleDAO;

import model.dao.MapDAO;

/**
 * <h1>The Class ModelFacade provides a facade of the Model component.</h1>
 *
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 */
public class ModelFacade extends Observable implements IModel, IMovable {
	private Map map;
	private BufferedImage image;
	private ImageManager imageManager;
	private ITile sand;
	private ITile dirt, wall, stone, diamond, player;
	private  ArrayList<ITile> mobile;
	//private final ArrayList<IEntity> mobiles;

    /**
     * Constructor of the class, instantiates the tiles of the map
     * @throws SQLException 
     */
	
    public ModelFacade() throws SQLException {
       // map = new Map(this);
      SpriteSheet ss = new SpriteSheet();
      imageManager = new ImageManager(ss, 1);
      

 	  sand = new SandTile(imageManager);
 	  dirt = new DirtTile(imageManager);
 	  wall = new WallTile(imageManager);
 	  stone = new StoneTile(imageManager);
 	  diamond = new DiamondTile(imageManager);
 	  player = new Player(imageManager);
 	 
    
    }
    

	@Override
	public char[][] transfoTab() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}











	@Override
	public ArrayList putInArrayList() {
		// TODO Auto-generated method stub
		return mobile;
	}





	@Override
	public ArrayList<ITile> getMobile() {
		// TODO Auto-generated method stub
		return mobile;
	}





	@Override
	public void setHEIGTH(int HEIGTH) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public int getHEIGTH() {
		// TODO Auto-generated method stub
		return 0;
	}





	@Override
	public void setWIDTH(int WIDTH) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public char[][] getTab() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage load(String path) {
		// TODO Auto-generated method stub
		return null;
	}



@Override
	public ITile getSand() {
		return sand;
	}


@Override

	public ITile getDirt() {
		return dirt;
	}


@Override

	public ITile getWall() {
		return wall;
	}



@Override
	public ITile getStone() {
		return stone;
	}



@Override
	public ITile getDiamond() {
		return diamond;
	}


public ITile getPlayer() {
	return player;
}

@Override
public void render(Graphics g, int x, int y, ImageObserver observer) {
	
}


@Override
public boolean isRight() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isDown() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isUp() {
	// TODO Auto-generated method stub
	return false;
}


@Override
public boolean isLeft() {
	// TODO Auto-generated method stub
	return false;
}











  
    }












