package com.greenfoxacademy.backendapi.Model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor
public class Double {
    ArrayList<Integer> result;

    public Double(ArrayList<Integer> numbers) {
        this.result = numbers;
    }

    public ArrayList<Integer> getResult() {
        return result;
    }

    public void setResult(ArrayList<Integer> result) {
        this.result = result;
    }



}
