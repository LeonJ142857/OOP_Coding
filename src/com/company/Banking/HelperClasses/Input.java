package com.company.Banking.HelperClasses;
import java.util.HashMap;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.company.Banking.MainClasses.Account;
import com.company.Banking.MainClasses.Bank;
import com.company.Banking.MainClasses.Customer;
import org.javatuples.Pair;
public class Input {
    public static HashMap<String, Bank> banks;
    private static final Scanner scanner = new Scanner(System.in);
    private static final Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");

    public static String input_bank_name(){
        boolean valid = false;
        String name = "";
        while(!valid){
            System.out.println("List of currently supported banks:");
            for(String bank : banks.keySet())
                System.out.printf("- %s \n", bank);
            System.out.println("Please enter the name of the bank: ");
            name = scanner.next();
            for(String bank: banks.keySet()) {
                if (name.equals(bank)) {
                    valid = true;
                    break;
                }
            }
            if(!valid) System.out.println("Bank is currently not supported or wrong name.");
        }
        System.out.println("Bank name is valid.");
        return name;
    }
    public static boolean check_real_name(
            String firstname, String lastname, ArrayList<Customer> customers)
    {
        for(Customer customer : customers){
            if(customer.getFirstname().equals(firstname) &&
                    customer.getLastname().equals(lastname))
                return true;
        }
        return false;
    }

    public static Pair<String, String> input_real_name(Bank bank){
        String firstname = "", lastname = "";
        boolean used;
        do{
            used = false;
            System.out.println("Please enter your real first name");
            firstname = scanner.next();
            System.out.println("Please enter your real last name");
            lastname = scanner.next();
            ArrayList<Customer> customers = bank.getCustomers();
            used = check_real_name(firstname, lastname, customers);
            if(used) System.out.println(
                    "First name and last name pair is already in use." +
                            " Please use another. Or login if this is you.");
        } while(used);
        System.out.println("First name and last name is valid.");
        return new Pair<String, String>(firstname, lastname);
    }

    public static String input_username(Bank bank){
        String username;
        boolean taken;
        do{
            taken = false;
            System.out.println("Please enter your username:");
            username = scanner.next();
            for (Customer customer : bank.getCustomers()){
                for(String user_name : customer.getAccounts().keySet()){
                    if(username.equals(user_name)) {
                        System.out.println("Username is already taken, please use another.");
                        taken = true;
                        break;
                    }
                }
            }
        } while(taken);
        System.out.println("Username is valid.");
        return username;
    }

    public static String input_password(){
        String s_pass = PassGen.generate(10);
        boolean first = true;
        char suggested;
        do{
            if(!first) System.out.println("Invalid input");
            System.out.printf("Suggested password: %s, Go with suggested (Y/N)?", s_pass);
            suggested = scanner.next().charAt(0);
            first = false;
        } while(suggested != 'Y' && suggested != 'N');
        boolean matched;
        if (suggested == 'Y'){
            System.out.printf("Creating account with password %s\n", s_pass);
            return s_pass;
        }
        else{
            String password;
            do{
                System.out.println("Your password should contain 8-24 characters" +
                        "with at least a character containing uppercase letter, lowercase letter, " +
                        "symbols: '!@#$%^&*()_+', and numbers (0-9)");
                System.out.println("Please enter your password: ");
                password = scanner.nextLine();
                matched = pattern.matcher(password).matches();
            } while(!matched);
            System.out.printf("Your password %s is valid\n", password);
            return password;
        }
    }

    public static int input_balance(){
        int balance;
        do{
            System.out.printf(
                    "Please enter initial balance to deposit" +
                            " to this account (minimum amount is %s)\n", Account.minimum
            );
            balance = scanner.nextInt();
        } while(balance < Account.minimum);
        return balance;
    }


}
