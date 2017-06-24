package model;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IMap extends IModel {
	public char[][] transfoTab() throws SQLException;
	
	public ArrayList<ITile> putInArrayList();
	
	public ArrayList<ITile> getMobile();
	
	public void setHEIGTH(int HEIGTH);
	
	public int getHEIGTH();
	
	public void setWIDTH(int WIDTH) ;
	
	char[][] getTab();

}
