package com.stackroute.firsttask;

public class Actor {
    private int age;
    private String gender;

    private String name;


    public void setName(String name) {
        this.name = name;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }



    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("name" +name + "age" + age+"gender" +gender);
    }
}
