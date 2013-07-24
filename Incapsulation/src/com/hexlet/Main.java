package com.hexlet;

/**
 * Created with IntelliJ IDEA.
 * User: Xibalba
 * Date: 15.07.13
 * Time: 21:45
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main (String[] args){
        Human human = new Human();
        human.setName("Alex!");

        System.out.println(human.getName());

        human.setName("Avi");
        System.out.println(human.getName());

        human.setAge(12);
        System.out.println(human.getAge());

        human.setName("Avraam");
        System.out.println(human.getName());

        human.setName(null);
        System.out.println(human.getName());

        human.setName("M");
        System.out.println(human.getName());

        String searchMe = "peter piper picked a " + "peck of pickled peppers";

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.nonStaticField = 4;
        ExampleClass.staticField = 4;

        ExampleClass exampleClass2 = new ExampleClass();
        exampleClass2.nonStaticField = 5;
        ExampleClass.staticField = 5;

        System.out.println(exampleClass.nonStaticField + "," + exampleClass2.nonStaticField);
        System.out.println(exampleClass.staticField + "," + exampleClass2.staticField);
        System.out.println("Human MIN_AGE" + Human.MIN_AGE);

        System.out.println(human.getName() + human.getAge());
    }
}
