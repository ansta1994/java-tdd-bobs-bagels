package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.add("Plane"));
    }

    @Test
    public void removeBagelTest() {
        Basket basket = new Basket();
        basket.add("Sesame");
        Assertions.assertFalse(basket.remove("Nutella"));
    }

    @Test
    public void changeCapBasketTest() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.changeCapBasket(0, 6));
        Assertions.assertFalse(basket.changeCapBasket(1, 1));
    }
}
