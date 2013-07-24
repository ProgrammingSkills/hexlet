package com.hexlet;

public class Human {
    public static final int MIN_AGE = 0;
    private static final int MAX_AGE = 130;
    private static final int MIN_NAME_LENGTH = 3;

    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge> Human.MIN_AGE && newAge< Human.MAX_AGE) {
             age = newAge;
        }
             else{
                  System.out.println("Age setting Error  !!");
        }
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        if(newName!=null && newName.length()>= MIN_NAME_LENGTH){
            name = newName;
        }
        else{
            System.out.println("name setting error");  }

    }

    public void sayHello(){
        System.out.println("Hi!");
    }
}
