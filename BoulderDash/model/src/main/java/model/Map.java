package model;

import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.dao.MapDAO;


/**
 * This class will store the String map into a table with two dimensions and draw the different Tiles in terms of the numbers stored in all Box.
 * @author Alexandre DASSONVILLE
 *@version 4.6.3
 */
public class Map implements IMap {
	
	private char[][] tab= new char[40][30];
	private  ArrayList<ITile> mobile;
	private char c;
	private IModel model;
	/**
	 * Constructor of the class
	 * @param model
	 * @throws SQLException
	 */

	public Map(IModel model) throws SQLException{
		this.model = model;
		this.mobile = new ArrayList<ITile>();
		this.putInArrayList();
		this.transfoTab();
	}

	public ArrayList<ITile> getMobile() {
		return mobile;
	}

	public static int WIDTH = 40;
	public static int HEIGTH = 30;
	
	/**
	 * 
	 * @return 
	 * 			tab
	 * @throws SQLException
	 */
	public char[][] transfoTab() throws SQLException{
		  String resultat = MapDAO.readInDB(1);
		  
		  for(int i=0; i<40; i++){
			  for(int j=0; j<30; j++){
				  c =  resultat.charAt(i+j*40);
				  tab[i][j]= c;
				 
				  
			  }
		  }

		return tab;
	}
	
	/**
	 * This method analysis the value of the character and draw the Tile matching to it
	 * @param c This is the value of the character
	 * @return This returns a Sand Tile if there is no character
	 */
	public  void drawTexture(char c, ArrayList<ITile> mobile){
		
		
		switch (c){
		 
		 case '0': 
			 mobile.get(0);
			 break;
			 
		 case '1':
			 mobile.get(1);
			 break;
			
			 
		 case '2':
			 mobile.get(2);
			 break;
			 
			
		 case '3':
			 mobile.get(3);
			 break;
			 
				 
		 case '4':
			 mobile.get(4);
			 break;
			 
		 default:
			 mobile.get(1);
			 break;
				
				  }
		
		
			  }
	
	/**
	 * @return
	 * 			mobile
	 * This method will store all the tiles in an arrayList, all different tiles matching to an index
	 */
	public ArrayList<ITile> putInArrayList(){
		mobile.add(0, model.getWall());
		mobile.add(1,model.getSand());
		 mobile.add(2,model.getDirt());
		 mobile.add(3,model.getStone());
		 mobile.add(4,model.getDiamond());
		 
		return mobile;
		
	}
/**
 * @return
 * 			return the char table
 */
	public char[][] getTab(){
		return tab;
	}
	public static int getWIDTH() {
		return WIDTH;
	}
/**
 * @param
 * 		  width of the map
 */
	public void setWIDTH(int wIDTH) {
		WIDTH = wIDTH;
	}

	public int getHEIGTH() {
		return HEIGTH;
	}
	/**
	 * @param
	 * 		  the height of the map
	 */
	public  void setHEIGTH(int HEIGTH) {
		HEIGTH = HEIGTH;
	}






	@Override
	public BufferedImage load(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BufferedImage getTile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITile getSand() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITile getDirt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITile getWall() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITile getStone() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ITile getDiamond() {
		// TODO Auto-generated method stub
		return null;
	}
		 
	}






