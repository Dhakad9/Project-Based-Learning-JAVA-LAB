import java.util.*;

public class InterestCalculator {

    public static void printChoices() {
        System.out.println("\nSelect the option:\r\n" + "1. Interest Calculator SB\r\n"
                + "2. Interest Calculator FD\r\n" + "3. Interest Calculator RD\r\n" + "4. Exit\r\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            printChoices();
            int choice = in.nextInt();
            if (choice == 4)
                break;
            switch (choice) {
                case 1: {
                    System.out.println("Enter type of account: ");
                    in.nextLine();
                    String typeOfAccount = in.nextLine();
                    if (typeOfAccount.compareToIgnoreCase("normal") == 0
                            || typeOfAccount.compareToIgnoreCase("nri") == 0) {
                        System.out.println("Enter the Average ammount in your account");
                        System.out.println("Interest gained: Rs."
                                + new SBAccount(typeOfAccount, in.nextDouble()).calculateInterest());
                    } else {
                        throw new InputMismatchException("Invalid account type! Please enter correct value.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Enter the FD Amount: ");
                    double amount = in.nextDouble();
                    System.out.println("Enter Number of Days: ");
                    int noOfDays = in.nextInt();
                    System.out.println("Enter your Age");
                    int ageOfACHolder = in.nextInt();
                    FDAccount obj = new FDAccount(amount, noOfDays, ageOfACHolder);
                    System.out.println("Interest gained is: " + obj.calculateInterest());
                    break;
                }
                case 3: {
                    System.out.println("Enter Amount: ");
                    double amount = in.nextDouble();
                    System.out.println("Enter No. of Months");
                    int noOfMon = in.nextInt();
                    System.out.println("Enter your Age");
                    int ageOfACHolder = in.nextInt();
                    System.out.println(
                            "Interest gained is: " + new RDAccount(amount, ageOfACHolder, noOfMon).calculateInterest());
                    break;
                }
                default: {
                    System.out.println("Invalid Choice!!Enter again");
                    break;
                }
            }
        }
    }
}