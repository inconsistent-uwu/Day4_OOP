package com.OOP;

import java.util.*;

public class Inheritance {
    public static class Color {
        String color = new String();

    }

    public static class Shape extends Color {
        int Length;
        int breadth;

        public int getLength() {
            return Length;
        }

        public void setLength(int length) {
            Length = length;
        }

        public int getBreadth() {
            return breadth;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }
    }

    public static interface display {
        void disp();

    }

    public static class Rectangle extends Shape implements display {
        void color(String color) {
            super.color = color;
        }

        public void disp() {
            System.out.println("Length: " + getLength());
            System.out.println("Breadth: " + getBreadth());
            System.out.println("Area: " + getBreadth() * getLength());
            System.out.println("Color: " + super.color);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.println("Color of the Rectangle: ");
        String c = sc.nextLine();
        rect.color(c);
        System.out.println("Enter the length and width of the rectangle");
        int x = sc.nextInt();
        rect.setLength(x);
        x = sc.nextInt();
        rect.setBreadth(x);
        rect.disp();
        sc.close();

    }

}
