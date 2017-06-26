package model;

import java.awt.*;
import java.awt.image.ImageObserver;

public interface ITile {


    void render(Graphics g, int x, int y, ImageObserver observer);


    boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    void setDirection(Direction direction);

    Direction getDirection();

    void setX(int x);

    int getX();

    void setY(int y);

    int getY();

}