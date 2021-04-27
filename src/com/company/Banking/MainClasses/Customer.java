package com.company.Banking;

import java.io.Serializable;
import java.util.HashMap;

public class Customer implements Serializable {
    private final String firstname;
    private final String lastname;
    private HashMap<String, Account> accounts;

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        accounts = new HashMap<String, Account>();
    }

    public String getFirstname() {return firstname;}

    public String getLastname() {return lastname;}

    public Account getAccount(String username) {return accounts.get(username);}

    public void addAccount(String username, Account account) {accounts.put(username, account);}

    public HashMap<String, Account> getAccounts() {return accounts;}

    public void setAccounts(HashMap<String, Account> accounts) {this.accounts = accounts;}

}
