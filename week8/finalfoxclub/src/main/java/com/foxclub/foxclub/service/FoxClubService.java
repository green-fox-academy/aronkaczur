package com.foxclub.foxclub.service;

import com.foxclub.foxclub.model.Fox;
import com.foxclub.foxclub.model.Trick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxClubService {
    private Fox fox;
    private List<Fox> listOfFoxes;
    private List<Trick> listOfTricks;

    @Autowired
    public FoxClubService() {
        this.fox = new Fox();
        this.listOfFoxes = new ArrayList<>();
        this.listOfTricks = Arrays.asList(new Trick("baking of bread"), new Trick("dancing"));
    }

    public Fox getFox() {
        return fox;
    }

    public List<Trick> getListOfTricks() {
        return listOfTricks;
    }

    public void setFoodAndDrink(String food, String drink) {
        this.fox.setFood(food);
        this.fox.setDrink(drink);
    }

    public void newFox(String name) {
        listOfFoxes.add(new Fox(name));
        loadActualFox(name);
        System.out.println("created new fox");
    }
    public void loadActualFox(String name) {
        for (Fox foxSearch : listOfFoxes) {
            if (foxSearch.getName().equals(name)) {
                this.fox = foxSearch;
            }
        }
    }

        public void addTrick(String trick) {
            fox.newTrick(new Trick(trick));
        }

        public boolean hasFoxName(String name) {
            loadActualFox(name);
            System.out.println("selected the fox");
            return listOfFoxes.stream().anyMatch(fox -> fox.getName().equals(name));
        }

}
