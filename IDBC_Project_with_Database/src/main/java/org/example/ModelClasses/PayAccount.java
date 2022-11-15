package org.example.ModelClasses;


public class PayAccount {

    private String accNo;
    private String holderName;
    private double balance;

    public PayAccount(String accNo, String holderName, double balance) {
        this.accNo = accNo;
        this.holderName=holderName;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }

    public void displayDetails(){
        System.out.printf("%-15s%15s%15s\n","Account no","Holder Name","Balance");
        System.out.printf("%-15s%15s%15s\n",getAccNo(),getHolderName(),getBalance());
    }
}
