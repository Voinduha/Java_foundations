package ru.danvu;
// наследник
public class Cotton extends Human {



    public Cotton(String name) {
        super(name);
    }

    Cotton sayRespectToPutin() {
        System.out.println("Путин наш Царь!");
        return this;
    }
}
