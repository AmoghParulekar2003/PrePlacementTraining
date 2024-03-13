//Shopping cart application
//addItems() --> itemNo, itemName, price
//showItems()
//deleteItems()
//updateItems()
//orderMenu()
//exit()
import java.util.Scanner;

public class ShoppingCart {

    ArrayList itemNo = new ArrayList();
    ArrayList itemName = new ArrayList();
    ArrayList  price = new ArrayList();

    public void addItems() {
        System.out.println("Add items to the cart");
        for(int i = 0; i < 100; i++) {
            itemNo.add(i);
            itemName.add(sc.next());
            price.add(sc.nextint());
        }
    }

    public void showItems() {

    }

    public void deleteItems() {

    }

    public void updateItem() {

    }

    public void orderMenu() {
        System.out.println("Here's what you have ordered so far");
        int totalPrice = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println((i+1)+"\t"+itemName.get(i).toString()+"\t"+price.get(i).toString());
            totalPrice = totalPrice + price.get(i);
        }
        System.out.println("Your total bill is: " +totalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner();
        ShoppingCart sp = new ShoppingCart();
        System.out.println("Welcome to Amazon.com's shopping cart!");
        System.out.println("Please select from the following options:");
        System.out.println("\t1. Add an Item to your Cart.");
        System.out.println("\t2. Show Items in your Cart.");
        System.out.println("\t3. Remove an Item from your Cart.");
        System.out.println("\t4. Update Quantity of an Item in your Cart.");
        System.out.println("\t5. Order Menu.");
        System.out.println("\t6. Exit Application.\n");
        int choice = sc.nextInt();

        while(true) {
            switch(choice) {
                case 1: sp.addItems();
                break;
                case 2: sp.showItems();
                break;
                case 3: sp.deleteItems();
                break;
                case 4: sp.updateItems();
                break;
                case 5: sp.orderMenu();
                break;
                case 6: System.exit(1);
                break;
            }
        }
    }
}
