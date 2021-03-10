class RDInterestTable {

    boolean citizenCheck = false;
    int noOfMon;

    RDInterestTable(int age, int noOfMon) {
        if (age >= 60) {
            citizenCheck = true;
        }
        this.noOfMon = noOfMon;
    }

    double getInterest() {
        if (noOfMon < 6)
            return 0.0;
        else if (noOfMon < 9)
            return citizenCheck ? 8.0 : 7.5;
        else if (noOfMon < 12)
            return citizenCheck ? 8.25 : 7.75;
        else if (noOfMon < 15)
            return citizenCheck ? 8.50 : 8.0;
        else if (noOfMon < 18)
            return citizenCheck ? 8.75 : 8.25;
        else if (noOfMon < 21)
            return citizenCheck ? 9.0 : 8.5;
        else
            return citizenCheck ? 9.25 : 8.75;
    }

}