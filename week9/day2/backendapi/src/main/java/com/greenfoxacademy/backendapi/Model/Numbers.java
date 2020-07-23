package com.greenfoxacademy.backendapi.Model;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
@NoArgsConstructor
public class Numbers {

    public ArrayList<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    ArrayList<Integer> numbers;

}
