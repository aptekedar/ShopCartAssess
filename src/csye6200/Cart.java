package neu.edu.csye6200;

public class Cart {
	private double myCash = 0;
	private double myTotal = 0;
	private double myChange = 0;
	
	public Cart(double myCash, double myTotal, double myChange) {
		super();
		this.myCash = myCash;
		this.myTotal = myTotal;
		this.myChange = myChange;
	}
	
	@Override
	public String toString() {
		return "Cart [myCash=" + myCash + ", myTotal=" + myTotal + ", myChange=" + myChange + "]";
	}
	
	public double getMyCash() {
		return myCash;
	}

	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}

	public double getMyTotal() {
		return myTotal;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public double getMyChange() {
		return myChange;
	}

	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}

	
	
	public void sillyCheckout(double cash, double price, double total, double change) {
		this.myTotal = total+price;
		this.myCash = cash - price;
		this.myChange = this.myCash;
		
		
	}
	
	public double Checkout(Cart myCart, Item myItem) {
		myCart.myTotal = myItem.getPrice() +myCart.myTotal;
		myCart.myCash = myCart.myCash-myItem.getPrice();
		myCart.myChange = myCart.myCash;
		return myChange;
	}

	

	
	

}

