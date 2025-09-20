abstract class Payment{
	abstract void pay();
}
class CreditCardPayment extends Payment{
	long cardNumber;
	double amount;
	CreditCardPayment(long cardNumber,double amount){
		this.cardNumber=cardNumber;
		this.amount=amount;
	}
	@Override
	public void pay(){
		System.out.println("Payment via Credit card "+cardNumber+"-> Rs"+amount+" Paid");
	}	
} 
class UPIPayment extends Payment{
	String upiId;
    double amount;
	UPIPayment(String upiId,double amount){
		this.upiId=upiId;
		this.amount=amount;
	}
	@Override
	public void pay(){
	    System.out.println("Payment via UPI "+upiId+"->Rs."+amount+" Paid");
	}
}
class PaymentDriver{
	public static void main(String[]args){
		Payment card = new CreditCardPayment(12345678,5000);
		card.pay();
		
		Payment upi = new UPIPayment("pdhiraj123@okaxis",7000);
		upi.pay();
	}
}

