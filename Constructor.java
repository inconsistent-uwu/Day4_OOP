package com.OOP;

public class Constructor {

    Constructor(String a) {
        System.out.println(a);
    }

    Constructor() {
        System.out.println("Constructor is called");
    }

    public static void main(String[] args) {
        Constructor Construct = new Constructor();
        Constructor Construct2 = new Constructor("Parameterized Constructor is called");

    }

}
