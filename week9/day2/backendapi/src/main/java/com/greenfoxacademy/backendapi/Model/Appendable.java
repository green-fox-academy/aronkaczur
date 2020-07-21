package com.greenfoxacademy.backendapi.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Appendable {
    String appended;



    public Appendable(String appendable) {
        this.appended = appendable+"a";
    }

    public Appendable(){

    }
    public String getAppendable() {
        return appended;
    }
}
