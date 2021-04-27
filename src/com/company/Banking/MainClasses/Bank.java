package com.company.Banking;
import java.io.Serializable;
import java.util.ArrayList;

public class Bank implements Serializable{
    private ArrayList<Customer> customers;
    private int numOfCustomers;
    private final String bankName;

    public Bank(String bankName){
        this.bankName = bankName;
        this.numOfCustomers = 0;
        customers = new ArrayList<Customer>();
    }

    public Customer addCustomer(String firstname, String lastname){
        Customer customer = new Customer(firstname, lastname);
        customers.add(customer);
        this.numOfCustomers++;
        return customer;
    }

    public int getNumOfCustomers() {return numOfCustomers;}

    public java.util.ArrayList<Customer> getCustomers() {return customers;}

    public Customer getCustomer(int index){return customers.get(index);}

    public String getBankName() {
        return bankName;
    }
}

