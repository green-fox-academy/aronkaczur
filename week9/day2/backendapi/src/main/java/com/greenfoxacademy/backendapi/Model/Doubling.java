package com.greenfoxacademy.backendapi.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Doubling {
    Integer received;
    Integer result;




    public Doubling(Integer received, Integer result) {
        this.received = received;
        this.result = result;
    }

    public Doubling(){

    }


    public Doubling(Integer input) {
    }
}
