package com.OOP;

public class StaticVar {
    static double pi = 3.14159265;

    static {
        System.out.println("\nThis is a static block\n");
    }

    public static void main(String[] args) {
        System.out.println(pi);
    }

}
