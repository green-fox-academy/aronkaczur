package com.greenfoxacademy.backendapi.Model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SumResult {
    Integer result;



    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }



    public SumResult(String action, Until until) {
        this.result = resulter(action,until);
    }

    private Integer resulter(String action, Until until) {
        if (action.equals("sum")) {
            Integer result = 0;
            for (int i = 0; i <= until.getUntil(); i++) {
                result = result + i;
            }return this.result= result;
        } else if (action.equals("factor")) {
            Integer result = 1;
            for (int i = 1; i <= until.getUntil(); i++) {
                result = result * i;
            }return this.result=result;
        }return null;
    }
}
