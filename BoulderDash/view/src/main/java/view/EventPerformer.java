package view;

import java.awt.event.KeyEvent;

import controller.IEventPerformer;
import controller.IUserOrder;
import controller.Order;
import controller.UserOrder;

public class EventPerformer implements EventPerformerable {
	private final IEventPerformer orderPerformer;
	
	public EventPerformer(IEventPerformer orderPerformer){
		this.orderPerformer = orderPerformer;
	}
	
	public void eventPerform(KeyEvent keyCode){
		IUserOrder userOrder = this.keyCodeToUserOrder (keyCode.getKeyCode());
		if(userOrder != null){
			this.orderPerformer.orderPerform(userOrder);
		}
	}
	
	private IUserOrder keyCodeToUserOrder (int keyCode){
		IUserOrder userOrder = null;
		
		switch (keyCode) {
		case KeyEvent.VK_UP:
		case KeyEvent.VK_Z:
			userOrder = new UserOrder(Order.UP);
			break;
		
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			userOrder = new UserOrder(Order.DOWN);
			break;
			
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_Q:
			userOrder = new UserOrder(Order.LEFT);
			break;
		
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			userOrder = new UserOrder(Order.RIGHT);
			break;
			
		case KeyEvent.VK_ESCAPE:
			userOrder = new UserOrder(Order.NOP);
			break;
		}
		
		
		return userOrder;
	}

}
