package ru.danvu;

public class Main {

    // целые числа
    byte byteVar;
    short aShort;
    int anInt = 1;
    long along;

    // числа с плавающей точкой
    double aDouble = 1.23;
    float aFloat;

    // логический тип
    boolean aBoolean = true;
    boolean bBoolean = false;


    // символ
    char aChar = 'c';


    public static void main(String[] args) {

        Liberal liberal = new Liberal("Даниил");
        Liberal anotherLiberal = new Liberal("Филлип");

        liberal.age = 44;
        anotherLiberal.age = 17;

        System.out.println(liberal.name);
        System.out.println(anotherLiberal.name);

       System.out.println(liberal.age + " Года");
       System.out.println(anotherLiberal.age + " Лет");

        liberal.sayRespectToNavalniy().sayRespectToNavalniy().sayRespectToNavalniy();
        anotherLiberal.sayRespectToNavalniy();

        int liberalAge = liberal.getAge();
        System.out.println(liberalAge);
        System.out.println(anotherLiberal.age);
        Propaganda.checkAge(anotherLiberal);

    }
}
