package main;


import alive.Human;
import alive.Pet;
import family.Family;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human();
        mother.setName("Alisa");
        mother.setSurname("Aslan");


        Human father = new Human();
        father.setName("Salman");
        father.setSurname("Aslan");

        Human fatherMom=new Human();
        fatherMom.setName("Amara");
        fatherMom.setSurname("Aslan");

        Human fatherFat=new Human();
        fatherMom.setName("Aga");
        fatherMom.setSurname("Aslan");
        father.setFamily(new Family(fatherMom,fatherFat));

        Family family = new Family(father, mother);


        Human child = new Human();
        child.setName("Narmina");
        child.setSurname("Aslan");

        Human child2 = new Human();
        child2.setName("Turana");
        child2.setSurname("Aslan");

        Human child3 = new Human();
        child3.setName("Emilia");
        child3.setSurname("Aslan");

        Human child4 = new Human();
        child4.setName("Amina");
        child4.setSurname("Aslan");

        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.deleteChild(child4);
        System.out.println(family);
        System.out.println();
    }
}
