package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import model.IMap;
import model.ITile;

/**
 * 
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * 
 * 
 *
 */
public class GraphicsBuilder implements IGraphicsBuilder {
	private static final ImageObserver ImageObserver = null;
	private static final Graphics Graphics = null;
	private IMap map;
	private ITile player;
	private char[][] mapTable;
	private static Graphics g;
	public int x;
	public int y;
	public static ImageObserver observer;
	
/**
 * Constructor of the class
 * @param tab
 * @param map
 */
	public GraphicsBuilder(char[][] tab, IMap map,ITile player){
		this.map = map;
		this.player = player;
		drawPLayer(g, 4, 4, null);
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
							 index = 3;
							 break;
							 
								 
						 case '4':
							 index = 4;
							 break;
							 
						 /*default:
							 
							 break;*/
								
								  }
			map.getMobile().get(index).render(g, i, j, observer);
				  }
			}
		}
		
		
	}
	
public void drawPLayer(Graphics g, int x, int y, ImageObserver observer){

	player.renderPlayer(g);
}
	
}
