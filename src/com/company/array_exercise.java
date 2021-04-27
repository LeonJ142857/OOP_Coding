package com.company;

public class array_exercise {
    public static void main(String[] args){
        int[] arr;
        int size = 10;
        arr = new int[size];
        for(int i = 0; i < size; ++i) arr[i] = i;
        reverse(arr, size);
        int value = 77;
        boolean contain = contains(arr, size, value);
        for(int i = 0; i < size; ++i)
            System.out.println(arr[i]);
        System.out.println(contain ?
                String.format("the array contains %d", value) :
                String.format("the array doesn't contain %d", value)
        );
    }
    public static void reverse(int arr[], int size){
        for(int i = 0; i < size/2; ++i){
            int temp = arr[size-i-1];
            arr[size-i-1] = arr[i];
            arr[i] = temp;
        }
    }
    public static boolean contains(int arr[], int size, int value){
        for (int j : arr) if (j == value) return true;
        return false;
    }
}
