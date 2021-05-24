package ru.danvu;

// суперкласс
public class Human {

    static String citizenship = "СССР";

    String name;
    int age;

    int getAge() {
        return age;
    }

    void born() {
        System.out.println("Я родился");
    }

    static void citizenship() {
        System.out.println(citizenship);
    }
}
