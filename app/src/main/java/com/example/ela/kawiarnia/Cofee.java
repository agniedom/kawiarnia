package com.example.ela.kawiarnia;

/**
 * Created by ELA on 16.01.2018.
 */

public class Cofee {
    private String name;
    private String price;


    public String getCofeeName() {
        return name;
    }

    public void setCofeeName(String Name) {
        this.name = Name;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String Price) {
        this.price = Price;
    }

    public Cofee(String name,  String price) {
        this.name = name;
        this.price = price;
    }


}
