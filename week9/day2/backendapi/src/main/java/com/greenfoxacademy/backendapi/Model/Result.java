package com.greenfoxacademy.backendapi.Model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Result {
    Integer result;

    public Result(Integer result) {
        this.result=result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
