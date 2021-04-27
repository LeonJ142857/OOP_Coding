package com.company.Banking;

import com.company.Banking.HelperClasses.BankingMenu;
import com.company.Banking.HelperClasses.Input;
import com.company.Banking.HelperClasses.ObjectIO;
import com.company.Banking.MainClasses.Bank;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Bank> banks = new HashMap<String, Bank>();
        String[] bank_names = {"BCA", "BRI", "BNI", "Mandiri", "OCBC", "Permata", "OCBC"};
        String projectPath = System.getProperty("user.dir");
        String localPath = "\\src\\com\\company\\Banking\\banks_data.txt";
        String absolutePath = projectPath + localPath;

        if(new File(absolutePath).length() > 0) {
            banks = (HashMap<String, Bank>) ObjectIO.ReadObjectFromFile(absolutePath);
        } else
            for(String bank_name : bank_names)
                banks.put(bank_name, new Bank(bank_name));
        System.out.println(
            "Welcome to a simple program to add account, deposit money,\n" +
            "withdraw money, and inquire about your balance.\n");

        BankingMenu.banks = banks;
        Input.banks = banks;
        BankingMenu.first_level_option();
        ObjectIO.WriteObjectToFile(absolutePath, banks);
    }
}
