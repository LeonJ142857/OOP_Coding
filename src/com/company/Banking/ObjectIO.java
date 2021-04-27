package com.company.Banking;
import java.io.*;


public class ObjectIO {
    public static void WriteObjectToFile(String filepath, Object object){
        try{
            FileOutputStream fileOut = new FileOutputStream(filepath, false);
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
    public static Object ReadObjectFromFile(String filepath){
        try{
            FileInputStream fileIn = new FileInputStream(filepath);
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
