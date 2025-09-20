interface Payment{
	void pay(double amount);
}
class CreditCardPayment implements Payment{
	public void pay(double amount){
		System.out.println("Processing Credit Card Payment of " + amount);
	}
}
class PaypalPayment implements Payment{
	public void pay(double amount){
		System.out.println("Processing Pay pal Payment of " + amount);
	}
}
class PaymentDriver24{
	public static void main(String[]args){
		CreditCardPayment cr = new CreditCardPayment();
		PaypalPayment pl = new PaypalPayment();
		
		cr.pay(2500);
		pl.pay(1500);
	}
}