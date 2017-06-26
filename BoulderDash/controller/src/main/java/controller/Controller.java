package controller;

import model.Direction;
import model.IModel;
import model.ITile;
import model.ImageManager;

import java.sql.SQLException;

public class Controller implements IController, IEventPerformer {

    private final IModel model;
    private ITile player;

    public Controller(IModel model) {
        this.model = model;
        player = this.model.getPlayer();
    }

    public void orderPerform(IUserOrder userOrder) {
        if (userOrder != null) {
            Direction direction = null;

            char[][] tiles = model.getMap().getTab();

            System.out.println(tiles[player.getX()][player.getY()]);

            switch (userOrder.getOrder()) {
                case UP:
                    direction = Direction.UP;

                    switch (tiles[player.getX()][player.getY() - 1]) {
                        case '0':
                        case '3':
                            break;

                        case '1':
                            model.getMap().setTab('2', player.getX(), player.getY() - 1);
                        default:
                            player.setY(player.getY() - 1);
                            break;
                    }

                    break;
                case DOWN:
                    direction = Direction.DOWN;

                    switch (tiles[player.getX()][player.getY() + 1]) {
                        case '0':
                        case '3':
                            break;

                        case '1':
                            model.getMap().setTab('2', player.getX(), player.getY() + 1);
                        default:
                            player.setY(player.getY() + 1);
                            break;
                    }

                    break;
                case LEFT:
                    direction = Direction.LEFT;

                    switch (tiles[player.getX() - 1][player.getY()]) {
                        case '0':
                        case '3':
                            break;

                        case '1':
                            model.getMap().setTab('2', player.getX() - 1, player.getY());
                        default:
                            player.setX(player.getX() - 1);
                            break;
                    }

                    break;
                case RIGHT:
                    direction = Direction.RIGHT;

                    switch (tiles[player.getX() + 1][player.getY()]) {
                        case '0':
                        case '3':
                            break;

                        case '1':
                            model.getMap().setTab('2', player.getX() + 1, player.getY());
                        default:
                            player.setX(player.getX() + 1);
                            break;
                    }

                    break;
                case NOP:
                    System.exit(0);
                    break;
            }
            model.getPlayer().setDirection(direction);

            manageCollision();
        }
    }

    private void manageCollision() {
        switch (player.getDirection()) {

        }
    }
}