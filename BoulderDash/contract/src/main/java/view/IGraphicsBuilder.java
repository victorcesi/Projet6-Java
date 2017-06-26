package view;
/**
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * Interface which contains the method to draw the map
 */
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	void applyModelToGraphic(Graphics graphics, ImageObserver observer);
	void drawPlayer(Graphics graphics, ImageObserver observer);
}
