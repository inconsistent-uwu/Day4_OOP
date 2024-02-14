package com.OOP;

public class Encapsulation {
    public static class Emp {
        private String name = new String();
        private int age;
        private int BaseSalary;
        private int bonus;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getBaseSalary() {
            return BaseSalary;
        }

        public void setBaseSalary(int baseSalary) {
            BaseSalary = baseSalary;
        }

        public int getBonus() {
            return bonus;
        }

        public void setBonus(int bonus) {
            this.bonus = bonus;
        }

        public int Total_salary() {
            return BaseSalary + bonus;
        }

        Emp(String name, int age, int bonus, int sal) {
            this.name = name;
            this.age = age;
            this.bonus = bonus;
            this.BaseSalary = sal;
        }

        public void display() {
            System.out.println("Name: " + getName());
            System.out.println("Age: " + getAge());
            System.out.println("Salary: " + Total_salary());
        }

    }

    public static void main(String[] args) {
        Emp e1 = new Emp("Raj", 21, 10000, 20000);

        e1.display();

    }

}
