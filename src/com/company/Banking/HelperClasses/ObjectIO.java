package com.company.Banking.HelperClasses;
import java.io.*;


public class ObjectIO {
    public static void WriteObjectToFile(String absolutePath, Object object){
        try{
            FileOutputStream fileOut = new FileOutputStream(absolutePath, false);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(object);
            objectOut.flush();
            objectOut.close();
            fileOut.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch(IOException e){
            System.out.println("Error initializing stream.");
        }


    }
    public static Object ReadObjectFromFile(String absolutePath){
        try{
            FileInputStream fileIn = new FileInputStream(absolutePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object object = objectIn.readObject();
            objectIn.close();
            fileIn.close();
            return object;
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
            return null;
        }
        catch(IOException e){
            System.out.println("Error initializing stream.");
            return null;
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
