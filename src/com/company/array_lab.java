package com.company;
import java.util.Arrays;
public class array_lab {
    public static void main(String[] args){
        boolean[] data = new boolean[3];
        Arrays.fill(data, 1, 3, true);
        boolean[] res = Arrays.copyOfRange(data, 1, 2);
        for(boolean d : res){
            System.out.println(d);
        }
        System.out.println();
    }
}
