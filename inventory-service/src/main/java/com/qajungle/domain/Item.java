package com.qajungle.domain;

public class Item {

    String name;
    int stock;
    Double price;

    public Item() {
    }

    public Item(String name, int stock, Double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public Double getPrice() {
        return price;
    }
}
