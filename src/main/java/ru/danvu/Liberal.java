package ru.danvu;
// наследник
public class Liberal extends Human {



    public Liberal(String name) {

        super(name);
    }

    Liberal sayRespectToNavalniy() {
        System.out.println( name + " Ненавидит Путина и Россия будет свободной!");
        return this;
    }
}
