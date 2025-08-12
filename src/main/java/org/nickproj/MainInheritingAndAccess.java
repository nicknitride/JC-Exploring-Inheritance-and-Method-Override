package org.nickproj;
// Parent class
class BankAccount {
    private double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double amount){
        balance = amount;
    }
}

// Child class
class CheckingAccount extends BankAccount {
    private double fee = 5.0;

    public CheckingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void deductMonthlyFee() {
//        balance = balance - fee;
        setBalance(getBalance()-fee);
        System.out.println("Fee deducted. New balance: " + getBalance());
    }
}

//public class MainInheritingAndAccess {
//    public static void main(String[] args) {
//        CheckingAccount myChecking = new CheckingAccount(100.0);
//         myChecking.deductMonthlyFee(); // This line cannot be run
//    }
//}