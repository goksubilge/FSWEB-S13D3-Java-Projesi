package com.bilge;

//  yarına NOT: get'ler (read) değer döner (dönüş değerin olur ---double--- örneğin.), set'ler (write) değer yazar. bu yüzden set lerin best practice dönüş değeri ---void--- yazmaktır.

public class Wall {
    double width;
    double height;

    /*
    Tek Constructor tanımladım ve buna 2 tane parametre almasını zorunlu koştum! parametresiz çağıramam.
    * */
    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {

        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public  double getArea(){
        return width * height;
    }
}
