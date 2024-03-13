//Shopping cart application
//addItems() --> itemNo, itemName, price
//showItems()
//deleteItems()
//updateItems()
//orderMenu()
//exit()
import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart {

    ArrayList<Integer> itemNo = new ArrayList<>();
    ArrayList<String> itemName = new ArrayList<>();
    ArrayList<Integer> price = new ArrayList<>();

    public void addItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add items to the cart (enter '0' for itemNo to stop):");
        int currentItemNo;
        while ((currentItemNo = sc.nextInt()) != 0) {
            itemNo.add(currentItemNo);
            itemName.add(sc.next());
            price.add(sc.nextInt());
        }
    }

    public void showItems() {
        System.out.println("Items in the cart:");
        for (int i = 0; i < itemNo.size(); i++) {
            System.out.println((i + 1) + "\t" + itemName.get(i) + "\t" + price.get(i));
        }
    }

    public void deleteItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item number to delete:");
        int itemNoToDelete = sc.nextInt();

        int index = itemNo.indexOf(itemNoToDelete);
        if (index != -1) {
            itemNo.remove(index);
            itemName.remove(index);
            price.remove(index);
            System.out.println("Item removed from the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    public void updateItems() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item number to update:");
        int itemNoToUpdate = sc.nextInt();

        int index = itemNo.indexOf(itemNoToUpdate);
        if (index != -1) {
            System.out.print("Enter new Item Name: ");
            itemName.set(index, sc.next());
            System.out.print("Enter new Item Price: ");
            price.set(index, sc.nextInt());
            System.out.println("Item updated in the cart.");
        } else {
            System.out.println("Item not found in the cart.");
        }
    }

    public void orderMenu() {
        System.out.println("Here's what you have ordered so far:");
        int totalPrice = 0;
        for (int i = 0; i < itemNo.size(); i++) {
            System.out.println((i + 1) + "\t" + itemName.get(i) + "\t" + price.get(i));
            totalPrice += price.get(i);
        }
        System.out.println("Your total bill is: $" + totalPrice);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart sp = new ShoppingCart();

        while (true) {
            System.out.println("\nPlease select from the following options:");
            System.out.println("1. Add an Item to your Cart");
            System.out.println("2. Show Items in your Cart");
            System.out.println("3. Remove an Item from your Cart");
            System.out.println("4. Update Quantity of an Item in your Cart");
            System.out.println("5. Order Menu");
            System.out.println("6. Exit Application");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sp.addItems();
                    break;
                case 2:
                    sp.showItems();
                    break;
                case 3:
                    sp.deleteItems();
                    break;
                case 4:
                    sp.updateItems();
                    break;
                case 5:
                    sp.orderMenu();
                    break;
                case 6:
                    System.out.println("Exiting the application. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
