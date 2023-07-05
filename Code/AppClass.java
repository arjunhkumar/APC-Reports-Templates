class TransnInfo { //Container Class
    long transactionID;
    AccountDetails debAccnt, credAccnt;
    double amount; }
class AccountDetails { //Primitive Value Class
    long accID; }
class A {
    final double LIMIT = 5000000;
    public boolean isLimitExceeded(long accID) {
        double amountSpent = 0;
        List<TransnInfo> tInfoLst = getCompletedTs();
        for (TransnInfo trnsInfo : tInfoLst) {
            if (trnsInfo.debAccnt.accID == accID)
                amountSpent += trnsInfo.amount; }
        return amountSpent >= this.LIMIT; } }
