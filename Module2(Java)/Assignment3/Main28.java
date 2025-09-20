class Product implements Discountable{
	private int productId;
	private String name;
	private double price;
	
	Product(int productId , String name , double price){
		this.productId=productId;
		this.name=name;
		this.price=price;
	}
	
	public void setProductId(int productId){
		this.productId=productId;
	}
	public int getProductId(){
		return productId;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(double price){
		this.price=price;
	}
	public double getPrice(){
		return price;
	}
	
	@Override 
	public void applyDiscount(double percentage){
		double discount = price * (percentage/100.);
		price -= discount;
		System.out.println("Applying " + percentage +" %discount to "+ name);
	}
}

abstract class CartItem{
	public abstract double calculateTotalPrice();
}

interface Discountable{
	void applyDiscount(double percentage);
}
class Cart extends CartItem{
	private Product[] products;
	private int count;
	
	Cart(int capacity){
		products = new Product[capacity];
		count=0;
	} 
	
	public void addProduct(Product product){
		if(count < products.length){
			products[count] = product;
			count++;
		}else {
		System.out.println("Cart is full,cannot add more products .");
		}
	}
	@Override
    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

}

class Main28{
	public static void main(String[]args){
		Product Laptop = new Product(1,"Laptop",70000);
		Product Mouse = new Product(2,"Mouse",450);
		Product Keyboard = new Product(3,"Keyboard",1230);
		
		Cart cart = new Cart(3);
		cart.addProduct(Laptop);
		cart.addProduct(Mouse);
		cart.addProduct(Keyboard);
		
		Laptop.applyDiscount(10);
		
		double totalPrice = cart.calculateTotalPrice();
		System.out.println("Total Cart Price = "+totalPrice);
		
		
	}

}

