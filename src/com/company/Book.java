package com.company;
import java.util.ArrayList;
public class Book {
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qty = 0;

    public Book(){
        //default constructor
    }
    
    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }
    
    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }  

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(ArrayList<Author> authors) { this.authors = authors; }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override   //annotation
    public String toString() {
        String auths_to_str = "";
        for(var author: authors){
            auths_to_str += author;
            auths_to_str += ", ";
        }
        return "Book{" + "name=" + name + ", authors=" + auths_to_str + ", price=" + price + ", qty=" + qty + '}';
    }
    
    
}
