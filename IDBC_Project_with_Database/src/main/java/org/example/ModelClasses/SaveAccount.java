package org.example.ModelClasses;

import java.util.Date;

public class SaveAccount {

    private String accNo;
    private String holderName;
    private double balance;
    private Date openingDate;

    public SaveAccount(String accNo, String holderName, double balance, Date openingDate) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        this.openingDate = openingDate;
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
    public Date getOpeningDate() {
        return openingDate;
    }

    public void displayDetails(){
        System.out.printf("%-15s%15s%15s%15s\n","Account no","Holder Name","Balance","Date of Opening");
        System.out.printf("%-15s%15s%15s%15s\n",getAccNo(),getHolderName(),getBalance(),getOpeningDate());
    }
}
