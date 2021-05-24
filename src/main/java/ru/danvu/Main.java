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

        Human.citizenship();
        Cotton cotton = new Cotton();
        Liberal liberal = new Liberal();
        liberal.born();
        Liberal anotherLiberal = new Liberal();
        liberal.name = "Даниил";

        Human.citizenship = "Африка";

        anotherLiberal.name = "Филлип";
        liberal.age = 44;
        anotherLiberal.age = 42;

//        System.out.println(liberal.name);
//        System.out.println(anotherLiberal.name);
//
//        System.out.println(liberal.age + " Года");
//        System.out.println(anotherLiberal.age + " Года");
//
//
        liberal.sayRespectToNavalniy().sayRespectToNavalniy().sayRespectToNavalniy();
        anotherLiberal.sayRespectToNavalniy();
//
//        liberal.citizenship();

        int liberalAge = liberal.age;
        System.out.println(liberalAge);

    }

}
