package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Aplicatie aplicatie = Aplicatie.getInstance();
        Actor actor1 = new Actor("asd", "asdf", "cel mai bun", 2, new ArrayList<>());
        Actor actor2 = new Actor("asdasd", "asdff", "cel mai bun 2", 1, new ArrayList<>());

        System.out.println(actor1);
        System.out.println(actor2);
    }
}
