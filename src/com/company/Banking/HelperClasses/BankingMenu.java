package com.company.Banking.HelperClasses;
import java.util.HashMap;
import java.util.Scanner;

import com.company.Banking.HelperClasses.Input;
import com.company.Banking.MainClasses.Account;
import com.company.Banking.MainClasses.Bank;
import com.company.Banking.MainClasses.Customer;
import org.javatuples.Pair;
public class BankingMenu {
    public static HashMap<String, Bank> banks;
    private static final Scanner scanner = new Scanner(System.in);

    public static Pair<Account, Boolean> loginStatus(HashMap<String, Account> accounts, String username, String password){
        if(accounts.get(username) != null){
            Account account = accounts.get(username);
            return new Pair<Account, Boolean> (
                    account, account.getUsername().equals(username) &&
                    account.getPassword().equals(password));
        }
        return new Pair<Account, Boolean> (null, false);
    }

    public static void login(){
        boolean status;
        Account account;

        do{
            String bankName = Input.input_bank_name();
            System.out.println("Please enter your username: ");
            String username = scanner.next();
            System.out.println("Please enter your password: ");
            String password = scanner.next();
            HashMap<String, Account> accounts = new HashMap<String, Account>();

            for(Customer customer : banks.get(bankName).getCustomers()){
                for(Account acc : customer.getAccounts().values())
                    accounts.put(acc.getUsername(), acc);
            }

            Pair<Account, Boolean> acc_stat = loginStatus(accounts, username, password);
            account = acc_stat.getValue0();
            status = acc_stat.getValue1();
            if(!status) System.out.println("Wrong username or password, please check again.");
        } while(!status);

        System.out.println("Login successful.\n");
        second_level_option(account);
    }

    public static void add_new_account(){
        String bankName = Input.input_bank_name();
        Pair<String, String> f_l = Input.input_real_name(banks.get(bankName));
        String firstname = f_l.getValue0(), lastname = f_l.getValue1();
        String username = Input.input_username(banks.get(bankName));
        String password = Input.input_password();
        double balance = Input.input_balance();
        Customer customer = banks.get(bankName).addCustomer(firstname, lastname);
        customer.addAccount(username, new Account(username, password, balance));
        first_level_option();


    }
    public static void first_level_option(){
        int f_option;
        do{
            System.out.println("Options:\n1. Add new account\n2. Login\n3. Quit\n");
            System.out.print("Please choose an option by inputting the number:");
            f_option = scanner.nextInt();
            if(f_option == 1) add_new_account();
            else if(f_option == 2) login();
            else if(f_option == 3){
                System.out.println("Thank you for using our service! We hope we can see you again soon.");
                break;
            }
        } while(f_option < 1 || f_option > 3);
    }
    public static void second_level_option(Account account){
        int s_option;
        do{
            System.out.println("Options:\n1. Deposit money" +
                    "\n2. Withdraw money\n3. Inquire Balance\n4. Back to First Level Option\n");
            System.out.println("Please choose an option by inputting the number:");
            s_option = scanner.nextInt();
            if(s_option == 1){
                System.out.print("How much money do you want to deposit to this account ?");
                double amt = scanner.nextDouble();
                account.deposit(amt);
            } else if(s_option == 2){
                System.out.print("How much money do you want to withdraw from this account ?");
                double amt = scanner.nextDouble();
                account.withdraw(amt);
            } else if(s_option == 3){
                double amt = account.getBalance();
                System.out.printf("Your balance is currently $%f\n", amt);
            } else if(s_option == 4) System.out.println("Quitting.\n");
            else System.out.println("command not recognized, please input a number in range 1-4.");
        } while(s_option != 4);
        first_level_option();
    }
}
