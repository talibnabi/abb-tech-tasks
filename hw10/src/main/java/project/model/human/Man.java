package project.model.human;

import project.model.human.Human;
import project.model.pet.Pet;


import java.text.ParseException;
import java.util.Map;

public final class Man extends Human {
    public Man() {
    }

    public Man(String name, String surname, String birthDate) throws ParseException {
        super(name, surname, birthDate);
    }

    public Man(String name, String surname, String birthDate, Integer iq, Map<String,String> schedule) throws ParseException {
        super(name, surname, birthDate, iq, schedule);
    }

    @Override
    public void greetPet() {
        Pet pets1 = null;
        for (Pet pet : getFamily().getPets()) {
            pets1 = pet;
        }
        assert pets1 != null;
        System.out.println("Hello," + pets1.getNickname());
    }

    public void repairCar() {
        System.out.println("I will repair the car.");
    }

}
