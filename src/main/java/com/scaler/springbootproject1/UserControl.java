package com.scaler.springbootproject1;

import com.scaler.springbootproject1.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
 @RestController("/user")
 @RequestMapping("/user") //global path
public class UserControl {
    private ArrayList<User> users=new ArrayList<User>();

    @PostMapping("/")
     public User createUser(@RequestBody User user){ //json format
        System.out.println("user added");
        users.add(user);
        return user;
    }
    @GetMapping("/{id}")
     public User getUser(@PathVariable int id){
        return users.get(id);
    }
     @GetMapping("/")
     public ArrayList<User> getAllUsers(){
        return users;
     }
}
