package com.company;

public class Cloth implements Merchandise {
    protected int rating;
    protected String name;
    protected int coast;
    protected String material;

    public Cloth(String name, int coast, int rating, String material ){
        this.name = name;
        this.coast = coast;
        this.rating = rating;
        this.material = material;
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

    public String getMaterial(){
        return material;
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
