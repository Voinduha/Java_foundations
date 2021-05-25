package ru.danvu;

public class Propaganda {


    public static void checkAge(Liberal anotherLiberal) {
    }

    void giveBullshit(Cotton cotton) {
        cotton.sayRespectToPutin();
        cotton.name = "Ватная рожа";
    }

        void checkAge(Cotton cotton) {
        if (cotton.age >= 18) {
            System.out.println("Тебе пиздец");
            giveBullshit(cotton);
        } else {
            System.out.println("Ты ссаный пионер");
        }
        }
    }

