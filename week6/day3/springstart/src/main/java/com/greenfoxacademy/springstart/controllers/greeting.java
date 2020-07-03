package com.greenfoxacademy.springstart.controllers;

public class greeting {
    public long id;
    public String content;


    public greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
