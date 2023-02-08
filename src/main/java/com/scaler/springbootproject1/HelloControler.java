package com.scaler.springbootproject1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HelloControler {
    private ArrayList<String> list =new ArrayList<>();

    @GetMapping("/Hello")
    public String Hello(){
        return "Hello World";
    }

    @GetMapping("/Good/{id}")
    public String Hello(@PathVariable String id){
        if(list.size()==0){
            return " Good Morning add in a list ";
        }
        String greet=list.get(Integer.parseInt(id));
        return "World " + greet+" !";
    }
    @PostMapping("/greetings")
    public void greetings(@RequestParam String greeting){
        System.out.println(" new greeting Added "+ greeting);
        list.add(greeting);

    }
}
