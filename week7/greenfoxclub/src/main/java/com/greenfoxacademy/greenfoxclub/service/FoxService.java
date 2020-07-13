package com.greenfoxacademy.greenfoxclub.service;

import com.greenfoxacademy.greenfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    List<Fox> foxes;
    String loggedUser;

    public void setUser(String loggedInUser) {
        this.loggedUser = loggedInUser;
    }

    public String getUser() {
        return loggedUser;
    }

    public FoxService() {
        this.foxes = new ArrayList<>();
        this.loggedUser = null;
    }

    public void addNewFox(String foxName) {
        Fox fox = new Fox(foxName);
        foxes.add(fox);
    }

    public List<Fox> getFoxList() {
        return foxes;
    }

    public Fox findFox(String name) {
        return foxes.stream()
                .filter(fox -> fox.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
