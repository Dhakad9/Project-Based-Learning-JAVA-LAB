import java.util.ArrayList;
import java.util.Scanner;

public class stringList {

    public static void main(String[] args) {
        ArrayList<String> p6 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean runner = true;
        while (runner) {
            System.out.println("1.Insert: ");
            System.out.println("2.Search: ");
            System.out.println("3.Delete: ");
            System.out.println("4.Display: ");
            System.out.println("5.Exit: ");

            int input = in.nextInt();

            switch (input) {
            case 1:
                System.out.println("Enter the item to be inserted:");
                String item = in.next();
                p6.add(item);
                System.out.println("Inserted Successfully");
                break;
            case 2:
                System.out.println("Enter Item you want to Search: ");
                String sItem = in.next();
                if (p6.indexOf(sItem) == -1)
                    System.out.println("Item not found in the list.");
                else
                    System.out.println("Item found in the list.");
                break;
            case 3:
                System.out.println("Delete the Desired: ");
                String dItem = in.next();
                if (p6.indexOf(dItem) != -1) {
                    p6.remove(dItem);
                    System.out.println("Deleted successfully");
                } else
                    System.out.println("Item does not exist.");
                break;
            case 4:
                System.out.println("The Items in the list are :");
                for (int i = 0; i < p6.size(); i++) {
                    System.out.println(p6.get(i));
                }
                break;
            case 5:
                runner = false;
                break;
            default:
                System.out.println("Invalid Choice");
                break;
            }
        }
        in.close();
    }
}