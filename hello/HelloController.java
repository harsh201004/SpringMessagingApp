package com.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping("/UC1")
    public String Hello() {
        return "Hello From BridgeLabz";
    }

    @GetMapping("/UC2")
    public String sayHelloWithName(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    @GetMapping("/UC3/{name}")
    public String sayHelloWithPath(@PathVariable String name) {
        return  "Hello " + name + " from BridgeLabz";
    }

    @PostMapping("/UC4")
    public  String showHelloNameWithPost(@RequestBody UserDTO user){
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/UC5/{firstName}")
    public  String showHelloNameWithPost(@PathVariable String firstName,@RequestParam String lastName){
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
