package com.greenfoxacademy.foxacademyown;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxService {

    private Fox fox;

    public List<Fox> getListofFoxes() {
        return listofFoxes;
    }

    private List<Fox> listofFoxes;
    private List<Trick> listofTricks;

    @Autowired
    public FoxService() {
        this.fox = new Fox();
        this.listofFoxes = new ArrayList<>();
        this.listofTricks = Arrays.asList(new Trick("baking"), new Trick("cooking"));
    }

    public Fox getFox() {
        return fox;
    }

    public List<Trick> getListofTrick(){
        return listofTricks;
    }

    public boolean checkItExist(String name){
        loadFox(name);
        System.out.println("exist check done");
        return listofFoxes.stream().anyMatch(fox -> fox.getName().equals(name));

    }

    public void loadFox(String name){
        for (Fox foxes : listofFoxes){
            if (foxes.getName().equals(name)){
                this.fox = foxes;
            }
        }
        System.out.println("exist check done");
    }

    public void newFox(String name){
        listofFoxes.add(new Fox(name));
        loadFox(name);
        System.out.println("made fox");
    }






}
