package com.example.ela.kawiarnia;

/**
 * Created by ELA on 16.01.2018.
 */

public class Cofee {
    private String name;
    private double price;


    public String getCofeeName() {
        return name;
    }

    public void setCofeeName(String Name) {
        this.name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cofee(String Name,  double price) {
        this.name = Name;

        this.price = price;
    }


}
