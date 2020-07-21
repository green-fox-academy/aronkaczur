package com.greenfoxacademy.backendapi.Controller;

import com.greenfoxacademy.backendapi.Model.*;
import com.greenfoxacademy.backendapi.Model.Appendable;
import com.greenfoxacademy.backendapi.Model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<? extends Object> doubling(@RequestParam(required = false) Integer input) {
        if (input == null) {
            return ResponseEntity.status(200).body(new Error("Please provide an input!"));
        }
        return ResponseEntity.status(200).body(new Doubling(input, input * 2));
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<? extends Object> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null && title == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a name and a title!"));
        } else if (name == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a name!"));
        } else if (title == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a title!"));
        } else {
            return ResponseEntity.status(200).body(new Greeter(name, title));
        }
    }

    @GetMapping("/appenda/{appenda}")
    @ResponseBody
    public ResponseEntity<? extends Object> appenda(@PathVariable(required = false) String appenda) {
        if (appenda == null) {
            return ResponseEntity.status(404).body(new Error("404"));
        } else {
            return ResponseEntity.status(200).body(new Appendable(appenda));
        }
    }

    @GetMapping("/dountil/{action}")
    @ResponseBody
    public ResponseEntity<? extends Object> action(@PathVariable(required = false) String action, @RequestParam(required = false) Integer until){
        return ResponseEntity.status(200).body(new SumResult(action,until));

        }



}













