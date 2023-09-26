package com.bilge;

public class Person {
    String firstName;
    String lastName;
    int age;
    int telNo;
    boolean isMarried;
    long ID;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Person (String firstName, String lastName, int age, int telNo, boolean isMarried, long ID ) {
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

    public String getFirstName() { return firstName;}
    public  String getLastName() {return lastName;}
    public int getAge() {return age;}
    public int getTelNo() {return telNo;}
    public boolean getisMarried() {return isMarried;}
    public long getID(){return ID;}

    public boolean isTeen(){
        return age>13 && age<19 ;
    }
}
