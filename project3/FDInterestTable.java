class FDInterestTable {
    boolean amtCheck = false, citizenCheck = false;
    int noOfDays;

    FDInterestTable(double amount, int age, int noOfDays) {
        if (amount > 10000000) {
            amtCheck = true;
        }
        if (age >= 60) {
            citizenCheck = true;
        }
        this.noOfDays = noOfDays;
    }

    double getInterest() {
        if (noOfDays < 7)
            return 0.0;
        else if (noOfDays < 15)
            return citizenCheck ? 5.0 : 4.5;
        else if (noOfDays < 30)
            return citizenCheck ? 5.25 : 4.75;
        else if (noOfDays < 46)
            return citizenCheck ? 6.0 : 5.5;
        else if (noOfDays < 61)
            return citizenCheck ? 7.5 : 7.0;
        else if (noOfDays < 185)
            return citizenCheck ? 8.0 : 7.5;
        else
            return citizenCheck ? 8.5 : 8.0;
    }
}