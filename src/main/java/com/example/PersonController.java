package com.example;


import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    Repository rep = new Repository();

    @GetMapping("/person")
    public Person person(@RequestParam(value = "name",defaultValue = "") String name){
        return rep.personByName(name);
    }
    @PostMapping("/person")
    public Person personUpdate(
            @RequestParam(value = "name")String name,
            @RequestParam(value = "age") int age){

        Person p = rep.personByName(name);
        if(p != null){
            p.setAge((age));
            return p;
        }
        else return rep.addPerson(new Person(name,age));

    }



}
