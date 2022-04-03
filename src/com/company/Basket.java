package com.company;

public class Basket implements Merchandise,User{
    protected int rating;
    protected String name;
    protected int coast;
    protected String username;
    protected String password;

    public Basket(Merchandise merchandise, User user) {
        this.name = merchandise.getName();
        this.coast = merchandise.getCoast();
        this.rating = merchandise.getRating();
        this.username = user.getUsername();
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

    @Override
    public void setCoastMerchandise(String password, int coast, Admin admin) {
        if(admin.Authorization(password)){
            this.coast = coast;
        }
        else {
            System.out.print("Неверный пароль");
        }
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username, String password) {
        if(password.equals(this.password)){
            this.username = username;
        }
        else {
            System.out.print("Неверный пароль");
        }
    }

    public void Buy(){
        System.out.printf("Пользователь %s купил товар %s", username, name);
    }
}
