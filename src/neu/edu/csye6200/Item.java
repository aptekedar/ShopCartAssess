package neu.edu.csye6200;

 

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

 

public class Item {
    private String name;
    private int price;
    public Item() {
        super();
    }

 

    public Item(String name, int price) {
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
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void demo(){
        Item item1 = new Item("Apple", (int) 4);
        Item item2 = new Item("Hat", (int) 5);
        Item item3 = new Item("chicken", (int) 10);
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
        System.out.println("TimeStamp:" + formattedDT);

 

        }
}
