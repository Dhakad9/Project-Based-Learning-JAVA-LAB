class SBInterestTable {
    double getInterest(String typeOfAccount) {
        if (typeOfAccount.compareToIgnoreCase("Normal") == 0)
            return 4.0;
        else
            return 6.0;
    }

}