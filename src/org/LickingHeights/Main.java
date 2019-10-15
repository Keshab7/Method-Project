package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printGreeting();
        printName(String);
    }

    public static void printGreeting(){
        System.out.println("Hello World");
    }

    public static String printName(String userName){
        Scanner keyboard;
        keyboard = new Scanner (System.in);
        System.out.println("What is your name?");
        userName = keyboard.nextLine();
        return "Hello" + userName;
    }
}
