package com.jingyi;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNUmber;

    public Account(){
        this("1234", 123, "default name", "default email", "default number");
        System.out.println("Empty custructor called");
    }
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNUmber){
        System.out.println("Account constructor with parameters are called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNUmber = customerPhoneNUmber;

    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawAmount){
        if (this.balance - withdrawAmount < 0){
            System.out.println("Only" + this.balance + " available. Withdrawal not processed");
        } else{
            this.balance -= withdrawAmount;
            System.out.println("Withdrawal of " + withdrawAmount + "processed. Remaining balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNUmber() {
        return customerPhoneNUmber;
    }

    public void setCustomerPhoneNUmber(String customerPhoneNUmber) {
        this.customerPhoneNUmber = customerPhoneNUmber;
    }
}
