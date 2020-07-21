package com.greenfoxacademy.backendapi.Model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Statement;

@Getter
@Setter
public class Greeter {
    String welcome_message;

    public Greeter(String name, String title) {
       this.welcome_message = "Oh, hi there "+name+", my dear "+title+"!";
    }

    public Greeter(){

    }

    public String getWelcome_message() {
        return welcome_message;
    }

}
