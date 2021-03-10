import java.util.InputMismatchException;

public class FDAccount extends Account {
    int ageOfACHolder;
    int noOfDays;

    FDAccount(double amount, int noOfDays, int ageOfACHolder) {
        if (amount < 0.0)
            throw new InputMismatchException("Invalid amount! Please enter correct value.");
        else
            this.amount = amount;
        if (noOfDays < 0)
            throw new InputMismatchException("Invalid no. of days! Please enter correct value.");
        else
            this.noOfDays = noOfDays;
        if (ageOfACHolder < 0)
            throw new InputMismatchException("Invalid age! Please enter correct value.");
        else
            this.ageOfACHolder = ageOfACHolder;
    }

    double calculateInterest() {
        FDInterestTable obj = new FDInterestTable(amount, ageOfACHolder, noOfDays);
        double interest = obj.getInterest();
        interest = (amount * interest) / 100;
        return interest;
    }
}
