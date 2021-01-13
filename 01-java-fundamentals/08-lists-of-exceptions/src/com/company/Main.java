package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        int i=0;
        try {
            for ( i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            }
        } catch (ClassCastException e) {
            System.out.println("Error occured at " + e.getMessage() + " " + myList.get(i));
        }


    }
}
