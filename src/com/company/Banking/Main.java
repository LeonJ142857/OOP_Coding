package com.company.Banking;

import java.io.File;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Bank> banks = new HashMap<String, Bank>();
        String[] bank_names = {"BCA", "BRI", "BNI", "Mandiri", "OCBC", "Permata", "OCBC"};
        String filepath = "banks_data.txt";
        if(new File(filepath).length() > 0)
            banks = (HashMap<String, Bank>) ObjectIO.ReadObjectFromFile(filepath);
        else
            for(String bank_name : bank_names)
                banks.put(bank_name, new Bank(bank_name));
        System.out.println(
            "Welcome to a simple program to add account, deposit money,\n" +
            "withdraw money, and inquire about your balance.\n");
        BankingMenu.banks = banks;
        Input.banks = banks;
        BankingMenu.first_level_option();
        ObjectIO.WriteObjectToFile(filepath, banks);
    }
}
