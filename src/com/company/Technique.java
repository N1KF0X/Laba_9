package com.company;

public class Technique implements Merchandise{
    protected int rating;
    protected String name;
    protected int coast;
    protected int warrantyInDays;

    public Technique(String name, int coast, int rating, int warrantyInDays){
        this.name = name;
        this.coast = coast;
        this.rating = rating;
        this.warrantyInDays = warrantyInDays;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public int getCoast() {
        return coast;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getWarrantyInDays() {
        return warrantyInDays;
    }

    @Override
    public void setCoastMerchandise(String password, int coast, Admin admin) {
        if(admin.Authorization(password)){
            this.coast = coast;
        }
        else {
            System.out.print("Неверный пароль");
        }
    }
}
