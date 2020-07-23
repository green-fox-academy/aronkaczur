package com.greenfoxacademy.backendapi.Controller;

import com.greenfoxacademy.backendapi.Model.*;
import com.greenfoxacademy.backendapi.Model.Appendable;
import com.greenfoxacademy.backendapi.Model.Double;
import com.greenfoxacademy.backendapi.Model.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class MainController {

    Double doubles;

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

    @PostMapping("/dountil/{action}")
    public ResponseEntity<? extends Object> action(@PathVariable(required = false) String action, @RequestBody Until until) {
        if (until.getUntil() == null) {
            return ResponseEntity.status(400).body(new Error("Please provide a number!"));
        }
        return ResponseEntity.status(200).body(new SumResult(action, until));

    }

    @PostMapping("/arrays")
    public ResponseEntity<? extends Object> array(@RequestBody Array array) {
        Integer result = 0;
        if (array.getWhat().equals("sum")) {
            for (int value : array.getNumbers()) {
                result += value;
            }
            return ResponseEntity.status(200).body(new Result(result));
        } else if (array.getWhat().equals("multiply")) {
            result = 1;
            for (int i = 0; i < array.getNumbers().size(); i++) {
                result = result * array.getNumbers().get(i);
            }
            return ResponseEntity.status(200).body(new Result(result));
        } else if (array.getWhat().equals("double")) {

            for (int i = 0; i < array.getNumbers().size(); i++) {
                array.getNumbers().set(i, array.getNumbers().get(i) * 2);
            }
            return ResponseEntity.status(200).body(new Double(array.getNumbers()));

        } else if (array.getWhat().equals("")) {
            return ResponseEntity.status(400).body(new Error("Provide what should I do"));
        } else if (array.getNumbers().size() == 0) {
            return ResponseEntity.status(400).body(new Error("Provide numbers"));
        } return null;
    }

    @PostMapping("/sith")
    public ResponseEntity<? extends Object> sithTalk(@RequestBody Sith sith){


    }
}


















