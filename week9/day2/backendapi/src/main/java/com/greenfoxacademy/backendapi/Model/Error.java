package com.greenfoxacademy.backendapi.Model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Error {
    String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Error(String error) {
        this.error = error;
    }
}
