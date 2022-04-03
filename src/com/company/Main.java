package com.company;

public class Main {

    public static void main(String[] args) {
        Merchandise bananas = new Fruits("bananas", 145, 3, 14);
        Merchandise hoodie = new Cloth("hoodie", 1499, 5, "knitted");
        Merchandise headphones = new Technique("headphones", 349, 4, 30);
        User anny = new Buyer("Anny02", "an02ny");
        User john = new Admin("John", "jj21");
        User elizabeth = new Accountant("Elizabeth", "El-th");
        Basket basket = new Basket(hoodie, anny);
        basket.Buy();
    }
}
