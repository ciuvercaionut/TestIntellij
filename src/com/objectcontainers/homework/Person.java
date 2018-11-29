package com.objectcontainers.homework;

import java.util.HashSet;

public class Person  {

    private String name;
    private int age;

    private String cnp;
    HashSet<Person> person = new HashSet<>();

    public Person(){

    }

    public Person(String name, int age, String cnp){
        this.name = name;
        this.age = age;
        this.cnp = cnp;

    }


    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
