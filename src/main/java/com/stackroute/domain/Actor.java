package com.stackroute.domain;

public class Actor {

    private String name;
    private String gender;
    private int age;



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String  getName() {
        return name;
    }

    public String  getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
