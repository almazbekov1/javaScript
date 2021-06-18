package com.example;


import java.util.Hashtable;
import java.util.Map;

public class Repository {

    static Map<String,Person> persons = new Hashtable<>();

    static {
        persons.put("Сергей",new Person("Сергей",35));
        persons.put("Костя",new Person("Сергей",25));
        persons.put("Саша",new Person("Сергей",15));
    }


    public Person personByName(String name){
        return persons.get(name);
    }

    public Person addPerson(Person p){
        persons.put(p.getName(),p);
        return p;
    }

    public static void main(String[] args) {
        double num1 = 45.342334;
        double num2 = 4.2453334;
        double num3 = 10.2334;
        double test1 = num1 * num2 * num3 * 10;
        System.out.println((double)((int)(test1))/10);

    }
}
