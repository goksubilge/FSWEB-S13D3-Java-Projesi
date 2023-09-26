package com.bilge;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new Person();
        System.out.println("****** ORNEK1 ******");
        Person x = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + x.getFirstName());
        System.out.println("LastName: " + x.getLastName());
        System.out.println("Age: " + x.getAge());
        System.out.println("isTeen: " + x.isTeen());
        System.out.println("****** ORNEK2 ******");
        Person y = new Person("Lotti", "Müller", 15, 67457898, false, 345678);
        System.out.println("Firstname: " + y.getFirstName());
        System.out.println("LastName: " + y.getLastName());
        System.out.println("Age: " + y.getAge());
        System.out.println("isTeen: " + y.isTeen());
        System.out.println("telNo: " + y.getTelNo());
        System.out.println("isMarried: " + y.getisMarried());
        System.out.println("ID: " + y.getID());
    }
}