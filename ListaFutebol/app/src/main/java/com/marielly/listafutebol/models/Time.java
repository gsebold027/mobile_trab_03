package com.marielly.listafutebol.models;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private int img;
    private String name;
    private String city;
    private ArrayList<String> titulos;

    public Time() { }

       public Time(int img, String name, String city, ArrayList<String> titulos ) {
        this.img = img;
        this.name = name;
        this.city = city;
        this.titulos = titulos;
    }

    public ArrayList<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(ArrayList<String> titulos) {
        this.titulos = titulos;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String owner) {
        this.city = city;
    }
}