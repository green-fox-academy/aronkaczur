package com.greenfoxacademy.greenfoxclub.model;

import java.util.List;

public class Fox {
    String name;
    List<String> tricksList;
    String food;
    String drink;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTricksList() {
        return tricksList;
    }

    public void setTricksList(List<String> tricksList) {
        this.tricksList = tricksList;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, List<String> tricksList, String food, String drink) {
        this.name = name;
        this.tricksList = tricksList;
        this.food = food;
        this.drink = drink;
    }
}
