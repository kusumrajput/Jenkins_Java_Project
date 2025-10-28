package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Java Project!");
        int result = addNumbers(6, 10);
        System.out.println("Sum of 6 and 10 is: " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
