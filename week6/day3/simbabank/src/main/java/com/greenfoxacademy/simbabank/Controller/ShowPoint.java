package com.greenfoxacademy.simbabank.Controller;

import com.greenfoxacademy.simbabank.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ShowPoint {

    List<BankAccount> list = new ArrayList<>();

    public void BankAccount(){
        list.add(new BankAccount("Simba",20000,"lion"));
        list.add(new BankAccount("Nala",10000,"lion"));
        list.add(new BankAccount("Zazu",200,"bird"));
        list.add(new BankAccount("Timon",11200,"timon"));
        list.add(new BankAccount("Rafiki",1000,"monkey"));
    }


    @GetMapping("/show")
    public String index(Model model){
        BankAccount bankaccount = new BankAccount ("Simba",  2000.00, "lion");
        model.addAttribute("bankaccount", bankaccount);
        return "show";
    }

    @RequestMapping("/html")
    public String htmlCeption(Model model) {
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "html";
    }

    @RequestMapping("/list")
    public String list (@ModelAttribute("account") BankAccount account){
        list.add(account);
        return "list";
    }
}
