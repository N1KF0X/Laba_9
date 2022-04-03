package com.company;

public class Accountant implements User{
    protected String username;
    protected String password;

    public Accountant(String username, String password){
        this.username = username;
        this.password = password;
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

    public void report(String password, Merchandise merchandise){
        if(password.equals(this.password)){
            System.out.println("Название: "+merchandise.getName()+"\n"+"Стоимость: "+merchandise.getCoast()+"\n"+"Рейтинг: "+merchandise.getRating());
        }
        else {
            System.out.print("Неверный пароль");
        }
    }
}
