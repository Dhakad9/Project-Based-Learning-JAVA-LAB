import java.util.InputMismatchException;

class RDAccount extends Account {
    int noOfMon;
    int age;

    RDAccount(double amount, int age, int noOfMon) {
        if (amount < 0.0)
            throw new InputMismatchException("Invalid amount! Please enter correct value.");
        else
            this.amount = amount;
        if (age < 0)
            throw new InputMismatchException("Invalid age! Please enter correct value.");
        else
            this.age = age;
        if (noOfMon < 0)
            throw new InputMismatchException("Invalid no. of months! Please enter correct value.");
        else
            this.noOfMon = noOfMon;
    }

    double calculateInterest() {
        RDInterestTable obj = new RDInterestTable(age, noOfMon);
        double interest = obj.getInterest();
        interest = (amount * interest) / 100;
        return interest;
    }

}