package model.test;

import model.DoorPay;
import model.OnlineClient;
import model.OnlineOrder;
import model.OnlinePay;
import model.TelephoneClient;
import model.TelephonicOrder;

public class Test {
	public static void main(String args[]){
		OnlineClient tanmay = new OnlineClient(new OnlineOrder(),new OnlinePay());
		tanmay.placeOnlineOrder();
		tanmay.makeOnlinePayment();
		
		TelephoneClient saloni = new TelephoneClient(new DoorPay(),new TelephonicOrder());
		saloni.placeTelephoneOrder();
		saloni.makeTelephonePayment();
	}
}
