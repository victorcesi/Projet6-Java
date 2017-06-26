package view;

import model.IMap;
import model.IModel;
import model.ITile;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 */
public class GraphicsBuilder implements IGraphicsBuilder {
    private static final ImageObserver ImageObserver = null;
    private static final Graphics Graphics = null;
    private IMap map;
    private ITile player;
    private IModel model;
    private char[][] mapTable;
    private static Graphics g;
    public int x;
    public int y;
    public static ImageObserver observer;

    /**
     * Constructor of the class
     *
     * @param tab
     * @param map
     */
    public GraphicsBuilder(char[][] tab, IMap map, IModel model) {
        this.model = model;
        this.map = map;
    }


    @Override
    public void applyModelToGraphic(Graphics g, ImageObserver observer) {
        int index = 0;

        if (!map.getMobile().isEmpty()) {
            mapTable = map.getTab();
            for (int i = 0; i < 40; i++) {
                for (int j = 0; j < 30; j++) {
                    switch (mapTable[i][j]) {

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

                        case '5':
                            index = 5;
                            break;

						 /*case '9' : 
							 index = 6;
							 break;*/

                    }
                    map.getMobile().get(index).render(g, i, j, observer);
                }
            }
        }


    }

    @Override
    public void drawPlayer(Graphics graphics, ImageObserver observer) {
        model.getPlayer().render(graphics, model.getPlayer().getX(), model.getPlayer().getY(), observer);
    }


}
