//Shopping cart application
//addItems() --> itemNo, itemName, price
//showItems()
//deleteItems()
//updateItems()
//orderMenu()
//exit()
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner()
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
            case 1: addItems();
            break;
            case 2: showItems();
            break;
            case 3: deleteItems();
            break;
            case 4: updateItems();
            break;
            case 5: orderMenu();
            break;
            case 6: System.exit(1);
            break;
        }
    }
}
