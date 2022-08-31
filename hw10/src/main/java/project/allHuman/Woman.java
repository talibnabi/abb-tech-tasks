package project.allHuman;

import project.allPet.Pet;

import java.util.List;
import java.util.Map;

public final class Woman extends Human {
    public Woman() {
    }

    public Woman(String name, String surname, long birthDate) {
        super(name, surname, birthDate);
    }

    public Woman(String name, String surname, long birthDate, Integer iq, Map<String, String> schedule) {
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

    public void makeup() {
        System.out.println("I will make up.");
    }
}
