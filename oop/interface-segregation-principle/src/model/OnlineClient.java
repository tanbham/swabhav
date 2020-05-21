package model;

public class OnlineClient {
	private IPayment pay;
	private IOrder order;
	
	public OnlineClient(IOrder order,IPayment pay){
		this.order = order;
		this.pay = pay;
	}
	
	
	public void makeOnlinePayment(){
		pay.pay();
	}
	
	public void placeOnlineOrder(){
		order.order();
	}

}
