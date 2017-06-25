package controller;

public class UserOrder implements IUserOrder {
	private Order order;
	
	public UserOrder(Order order){
		this.order = order;
	}

	@Override
	public Order getOrder() {
		return this.order;
	}

}
