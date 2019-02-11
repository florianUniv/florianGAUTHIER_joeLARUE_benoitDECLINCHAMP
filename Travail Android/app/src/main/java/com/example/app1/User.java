package com.example.app1;

public class User {
    private String Nom;
    private String Premon;
    private int Color = 0;
    public User (String Nom, String Premon){
        this.Nom=Nom;
        this.Premon=Premon;

    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPremon() {
        return Premon;
    }

    public void setPremon(String premon) {
        Premon = premon;
    }

    public int getColor() {
        return Color;
    }

    public void setColor(int color) {
        Color = color;
    }

    public String toSting (){
        return Nom+" "+Premon+" "+Color;
    }
}
