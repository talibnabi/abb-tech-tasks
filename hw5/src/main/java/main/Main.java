package main;

import alive.Human;
import alive.Pet;
import family.Family;

public class Main {
    public static void main(String[] args) {
        Family family=new Family();
        family.addChild(new Human());
        boolean b=family.deleteChild(1);
        System.out.println(b);

    }

}
