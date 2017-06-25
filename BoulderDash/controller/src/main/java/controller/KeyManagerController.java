package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.Direction;
import model.IModel;
import model.IMovable;
import model.ITile;
import model.ImageManager;
import model.Player;
import view.IkeyManager;

public class KeyManagerController implements IController, IEventPerformer {

	private ITile player;
	private ImageManager im;
	private boolean rt, up, lt, dn;

	public void orderPerform(IUserOrder userOrder) {
		if(userOrder != null){
			Direction direction = null;
			switch (userOrder.getOrder()){
			case UP:
				direction = Direction.UP;
				System.out.println("Go up");
				break;
			case DOWN:
				direction = Direction.DOWN;
				System.out.println("Go down");
				break;
			case LEFT:
				direction = Direction.LEFT;
				System.out.println("Go left");
				break;
			case RIGHT:
				direction = Direction.RIGHT;
				System.out.println("Go right");
				break;
			case NOP:
				direction = Direction.NOP;
				System.out.println("None");
				break;
			}
		}
	}

	
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}





}