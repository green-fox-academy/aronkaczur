package com.foxclub.foxclub.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Fox{
    private String name;
    private List<Trick> listOfTricks;
    private String food;
    private String drink;


    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }
    public Fox() {
        name = "Mr.Green";
        food = "salad";
        listOfTricks = new ArrayList<>();
        drink = "water";
    }

    public Fox(String name) {
        this.name = name;
        food = "bread";
        listOfTricks = new ArrayList<>();
        drink = "lemonade";
    }


    public void newTrick(Trick trick) {
        listOfTricks.add(trick);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public void setListOfTricks(List<Trick> listOfTricks) {
        this.listOfTricks = listOfTricks;
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
}
