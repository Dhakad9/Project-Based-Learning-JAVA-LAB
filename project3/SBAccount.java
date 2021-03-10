import java.util.InputMismatchException;

class SBAccount extends Account {
    String typeOfAccount;

    SBAccount(String typeOfAccount, double amount) {
        this.typeOfAccount = typeOfAccount;
        if (amount >= 0.0)
            this.amount = amount;
        else
            throw new InputMismatchException("Invalid amount! Please enter correct value.");
    }

    double calculateInterest() {
        SBInterestTable obj = new SBInterestTable();
        interestRate = obj.getInterest(typeOfAccount);
        interestRate = (amount * interestRate) / 100;
        return interestRate;
    }
}