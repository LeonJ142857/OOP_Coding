package com.company.Banking;

import java.io.Serializable;

public class Account implements Serializable {
    public static final int minimum = 1000;
    private double balance;
    private final String username;
    private String password;

    public Account(String username, String password, double balance){
        this.username = username;
        this.password = password;
        this.balance = balance;
        System.out.println("\nAccount has been set up successfully");
        System.out.printf("Your username: %s\n Your password: %s\n", username, password);
        System.out.println("Never give your password to people you don't trust.\n");
    }

    public void deposit(double amt){
        if(amt <= 0) {
            System.out.println("Negative amount is invalid, deposit failed.\n");
            return;
        }
        balance += amt;
        System.out.printf("$%f have been successfully deposited. \nThank you for using our service!\n", amt);
    }

    public void withdraw(double amt){
        if(amt <= 0 || amt > balance) {
            System.out.println("Negative amount or withdrawing more than your " +
                    "balance is invalid, withdrawal failed.\n");
            return;
        }
        balance -= amt;
        System.out.printf("$%f have been successfully withdrawn.\n Thank you for using our service!\n", amt);
    }
    public String getUsername() {return username;}

    public void setPassword(String password){this.password = password;}
    public String getPassword() {return password;}
    public double getBalance() {return balance;}

}
