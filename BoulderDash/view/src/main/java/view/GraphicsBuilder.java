package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import model.IMap;

/**
 * 
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * 
 * 
 *
 */
public class GraphicsBuilder implements IGraphicsBuilder {
	private IMap map;
	private char[][] mapTable;
/**
 * Constructor of the class
 * @param tab
 * @param map
 */
	public GraphicsBuilder(char[][] tab, IMap map){
		this.map = map;
	}
	



	@Override
	public void applyModelToGraphic(Graphics g, ImageObserver observer) {
		int index =0;
		
		if(!map.getMobile().isEmpty()){
			mapTable = map.getTab();
			for(int i=0; i<40; i++){
				  for(int j=0; j<30; j++){
					  switch (mapTable[i][j]){
						 
						 case '0': 
							 index = 0;
							 break;
							 
						 case '1':
							 index = 1;
							 break;
							
							 
						 case '2':
							 index = 2;
							 break;
							 
							
							 
						 case '3':
							// index = 3;
							 break;
							 
								 
						 case '4':
							// index = 4;
							 break;
							 
						 /*default:
							 
							 break;*/
								
								  }
			map.getMobile().get(index).render(g, i, j, observer);
				  }
			}
		}
		
		
	}
}