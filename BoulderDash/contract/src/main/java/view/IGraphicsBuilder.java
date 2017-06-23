package view;
/**
 * @author Alexandre DASSONVILLE
 * @version 4.6.3
 * Interface which contains the method to draw the map
 */
import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer);

}
