package com.greenfoxacademy.backendapi.Model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor
public class Array {
    String what;
    ArrayList<Integer> numbers;

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }
}
