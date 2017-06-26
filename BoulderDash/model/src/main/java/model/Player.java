package model;

import java.awt.*;
import java.awt.image.ImageObserver;


public class Player extends Tile implements ITile, IMovable {
    private Direction direction;
    private int x;
    private int y;

    public Player(ImageManager im) {
        super(im);
        direction = Direction.DOWN;
        x = y = 1;
    }

    public void tick() {
    }

    @Override
    public void render(Graphics g, int x, int y, ImageObserver observer) {
        // TODO Auto-generated method stub

        g.drawImage(im.playerTile, x * 16, y * 16, 16, 16, null);
    }


    @Override
    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public boolean isRight() {
        return false;
    }

    @Override
    public boolean isDown() {
        return false;
    }

    @Override
    public boolean isUp() {
        return false;
    }

    @Override
    public boolean isLeft() {
        return false;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

