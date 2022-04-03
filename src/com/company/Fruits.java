package com.company;

public class Fruits implements Merchandise {
    protected int rating;
    protected String name;
    protected int coast;
    protected int expiryDateInDays;

    public Fruits(String name, int coast, int rating, int expiryDateInDays) {
        this.name = name;
        this.coast = coast;
        this.rating = rating;
        this.expiryDateInDays = expiryDateInDays;
    }

    public int getRating() {
        return this.rating;
    }

    public int getCoast() {
        return this.coast;
    }

    public String getName() {
        return this.name;
    }

    public void setCoastMerchandise(String password, int coast, Admin admin) {
        if (admin.Authorization(password)) {
            this.coast = coast;
        } else {
            System.out.print("Неверный пароль");
        }

    }

    public int getExpiryDateInDays() {
        return this.expiryDateInDays;
    }
}
