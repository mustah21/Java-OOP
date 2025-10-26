// task 1 only
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    private ArrayList<String> groceryList;

    public GroceryListManager() {
        this.groceryList = new ArrayList<>();
    }

    void addItem(String item) {
        if (item != null) {
            this.groceryList.add(item);
        }
    }

    void removeItem(String item) {
        if (item != null) {
            this.groceryList.remove(item);
        }
    }

    void displayList() {
        int i = 1;
        for (String item : groceryList) {
            System.out.println("\n" + i  + ": " + item);
            i++;
        }
    }

    boolean checkItem(String item) {
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager listManager = new GroceryListManager();

//Created a loop so I could check all possible cases


//        Scanner scan = new Scanner(System.in);

//        do {
//            // Suggested by AI gemini: Flag to track if the user executed any operation this iteration
//            boolean actionTaken = false;
//
//            System.out.println("Enter the item you will like to ADD in the list (*empty input to skip*): ");
//            String adding = scan.nextLine();
//
//            if (adding != null && !adding.trim().isEmpty()) {
//                listManager.addItem(adding);
//                actionTaken = true;
//            }
//
//
//            if (!actionTaken) {
//                System.out.println("Enter the item you will like to REMOVE from the list (*empty input to skip*): ");
//                String removing = scan.nextLine();
//
//                if (removing != null && !removing.trim().isEmpty()) {
//                    listManager.removeItem(removing);
//                    actionTaken = true; // Action was taken
//                }
//            }
//            if (!actionTaken) {
//                System.out.println("Enter the item you will like to CHECK from the list (*empty input to exit*): ");
//                String checking = scan.nextLine();
//
//                if (checking != null && !checking.trim().isEmpty()) {
//                    boolean itemFound = listManager.checkItem(checking);
//                    if (!itemFound) {
//                        System.out.println("\nItem " + checking + " does not exist in the list.");
//                    } else {
//                        System.out.println("Item " + checking + " exists in the list.");
//                    }
//                    actionTaken = true;
//                    // break;
//                }
//            }
//
//            if (!actionTaken) {
//                break;
//            }
//
//        } while (true);
//        System.out.println("------List Printing------");
//        listManager.displayList();

        GroceryListManager manager = new GroceryListManager();

        manager.addItem("Apples");
        manager.addItem("Milk");
        manager.addItem("Bread");
        manager.addItem("Corn");

        System.out.println("Grocery List:");
        manager.displayList();

        String itemToCheck = "Milk";
        boolean found = manager.checkItem(itemToCheck);
        System.out.println("\nIs \"" + itemToCheck + "\" in the grocery list? " + found);

        String itemToRemove = "Milk";
        System.out.println("\nRemoving \"" + itemToRemove + "\" from the list...");
        manager.removeItem(itemToRemove);

        System.out.println("\nUpdated Grocery List:");
        manager.displayList();

    }

}