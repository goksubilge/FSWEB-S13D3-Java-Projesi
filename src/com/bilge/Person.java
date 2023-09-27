package com.bilge;

// NOT: Bir Metodu Main'in içinde çağırmayacaksam static olarak tanımlamama gerek yok.
public class Person {
    /* --- INSTANCES --- */
    String firstName;
    String lastName;
    int age;
    double telNo;
    boolean isMarried;
    long ID;

    /* --- CONSTRUCTORS ---*/
    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, int age, double telNo, boolean isMarried, long ID ) {
        // constructor chaining !!
        // this(firstName, lastName, age); yukarıda olanları çağırdık önce. buna constructor chaining deniyor.
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.telNo = telNo;
        this.isMarried = isMarried;
        this.ID = ID;
    }
    public Person () {
        this("Bilge", "Goksu", 22, 543210, true, 987654321);
        System.out.println("isim: " + firstName);
        System.out.println("soyisim: " + lastName);
        System.out.println("yas: " + age);
    }

    /* --- METHODS ---*/
    public String getFirstName() { return firstName;}
    public  String getLastName() {return lastName;}
    public int getAge() {return age;}
    public double getTelNo() {return telNo;}
    public boolean getIsMarried() {return isMarried;}
    public long getID(){return ID;}
    public boolean isTeen(){
        return age>13 && age<19 ;
    }

    @Override
    public String toString() {
         // return "Firstname: " + firstName + " Lastname: " + lastName + " Age: " + age + " TelNo: " + telNo;
         return String.format("Firstname: %s, Lastname: %s, Age: %d, telNo: %.2f, Married Status: %b", getFirstName(), getLastName(), getAge(), getTelNo(), getIsMarried());
        // format bir hata var, bulamadım.
    }
}
