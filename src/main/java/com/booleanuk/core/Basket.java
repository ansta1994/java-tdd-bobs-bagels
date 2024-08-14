package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    int maxCapBasket;

    public Basket() {
        this.basket = new ArrayList<>();
        this.maxCapBasket = 5;
    }

    public boolean add(String product) {
        basket.add(product);
        return basket.contains(product);
    }

    public boolean remove(String product) {
        basket.remove(product);
        return basket.contains(product);
    }
}
