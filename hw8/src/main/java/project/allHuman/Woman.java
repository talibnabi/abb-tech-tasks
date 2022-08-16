package project.allHuman;

import java.util.List;
import java.util.Map;

public final class Woman extends Human {
    public Woman() {
    }

    public Woman(String name, String surname, Integer year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, Integer year, Integer iq, Map<String,String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello," + getFamily().getPet().getNickname());
    }

    public void makeup() {
        System.out.println("I will make up.");
    }
}
