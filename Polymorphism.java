package com.OOP;

import java.util.*;

public class Polymorphism {
    public static class dispInfo {

        void display() {
            System.out.println("Displaying Info of parent class.");
        }
    }

    public static class Emp extends dispInfo {
        String name = new String();

        public String getName() {
            return name;
        }

        Emp() {
            System.out.println("This is default constructor");
        }

        Emp(String name) {
            this.name = name;
        }

        @Override
        void display() {

            System.out.println("Name: " + getName());

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name ");
        String name = sc.nextLine();
        Emp e3 = new Emp();
        Emp e1 = new Emp(name);
        dispInfo e2 = new dispInfo();
        e2.display();
        e1.display();

        sc.close();

    }

}
