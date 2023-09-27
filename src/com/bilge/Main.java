package com.bilge;

public class Main {
    public static void main(String[] args) {
        System.out.println("****** PERSON ******");

        System.out.println("****** SAMPLE-1 ******");

        new Person();
        Person x = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + x.getFirstName());
        System.out.println("LastName: " + x.getLastName());
        System.out.println("Age: " + x.getAge());
        System.out.println("isTeen: " + x.isTeen());
        System.out.println(x); // zaten arka planda  .toString() i çalıştırır.

        System.out.println("****** SAMPLE-2 ******");

        Person z = new Person("ALI", "VELI", 30);
        z.telNo = 123456789;
        z.isMarried = true;
        System.out.println(z);

        System.out.println("****** SAMPLE-3 ******");

        Person y = new Person("Lotti", "Müller", 15, 67457898, false, 345678);
        System.out.println("Firstname: " + y.getFirstName());
        System.out.println("LastName: " + y.getLastName());
        System.out.println("Age: " + y.getAge());
        System.out.println("isTeen: " + y.isTeen());
        System.out.println("telNo: " + y.getTelNo());
        System.out.println("isMarried: " + y.getIsMarried());
        System.out.println("ID: " + y.getID());

        System.out.println("****** WALL ******");

        Wall wall = new Wall(5,4);
        System.out.println("Area: " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width: " + wall.getWidth() );
        System.out.println("height: " + wall.getHeight());
        System.out.println("area: " + wall.getArea());

        /*
        NOTLAR: Şu anda class'ın instance'larına çok rahat erişebiliyorum. ve eksi değerle alan hesaplaması yapılabiliyor. bir GAP var kodumda.

        Wall wall1 = new Wall (3,2);
        wall1.setWidth(4);
        wall1.setHeight(3);
        System.out.println(wall1.getArea());
        System.out.println(wall1.getWidth() * wall1.getHeight());
        wall1.width = 5;

         */
    }
}