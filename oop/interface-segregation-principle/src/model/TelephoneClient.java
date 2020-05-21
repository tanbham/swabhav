package model;

public class TelephoneClient {
	private IPayment pay;
	private IOrder order;
	
	public TelephoneClient(IPayment pay , IOrder order){
		this.pay = pay;
		this.order = order;
	}
	
	public void makeTelephonePayment(){
		pay.pay();
	}
	
	public void placeTelephoneOrder(){
		order.order();
	}

}
