package neu.edu.csye6200;

 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 
public class Item {
    private String name;
    private double price;
    public Item() {
        super();
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    
    @Override
    public String toString() {
        return "Item{" + "name='" + name + '\'' + ", $ price=" + price + '}';
    }
    public static final double REVISION = 1.0;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void demo(){
        Item item1 = new Item("Apple", (double) 4);
        Item item2 = new Item("Hat", (double) 5);
        Item item3 = new Item("chicken", (double) 10);
        double total = item1.price + item2.price + item3.price;
        double cash = 20.0;
        double change = cash - total;
        System.out.print("ITEM\tPRICE\n");
        System.out.print(""+ item1.name + "\t" + item1.price + "$\n");
        System.out.print(""+ item2.name + "\t" + item2.price + "$\n");
        System.out.print(""+ item3.name + "\t" + item3.price + "$\n");
        System.out.println("\n") ;
        System.out.print("Remaining Cash: " + change + "$");
        System.out.println("\n") ;

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH:mm");
        LocalDateTime dateTime = LocalDateTime.now();
        String formattedDT = dateTime.format(dateTimeFormatter);
        System.out.println("TimeStamp:" + formattedDT + "\n");
        
        System.out.println("Pass By Value: \n");
        
        // Create a shopping cart
        Cart cart1 = new Cart(20.0, 0.0, 0.0);

        // Add items to the cart and calculate change using sillyCheckout
        cart1.sillyCheckout(cart1.getMyCash(), item1.getPrice(), cart1.getMyTotal(), cart1.getMyChange());
        System.out.println(cart1.toString());
        cart1.sillyCheckout(cart1.getMyCash(),item2.getPrice(), cart1.getMyTotal(), cart1.getMyChange());
        System.out.println(cart1.toString());
        cart1.sillyCheckout(cart1.getMyCash(),item3.getPrice(), cart1.getMyTotal(), cart1.getMyChange());
        System.out.println(cart1.toString());
        
        
        System.out.println("\n");
        System.out.println("Pass By Reference: \n");
        
        Cart cart2 = new Cart(20.0, 0.0, 0.0);
        
        // Add items to the cart and calculate change using checkout
        cart2.Checkout(cart2, item1);
        System.out.println(cart2.toString());
        cart2.Checkout(cart2, item2);
        System.out.println(cart2.toString());
        cart2.Checkout(cart2, item3);
        System.out.println(cart2.toString());

        // Show the itemized receipt and change
        //cart.printReceipt();
    }
}
