package com.company;

public class Buyer implements User{
    protected String username;
    protected String password;

    public Buyer(String username, String password){
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
}
