package project.allPet;

import project.allEnum.Species;

import java.util.List;
import java.util.Set;

public class DomesticCat extends Pet implements Unpleasant {
    public DomesticCat() {
        super.setSpecies(Species.UNKNOWN);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.UNKNOWN);
    }

    public DomesticCat(String nickname, Integer age, Integer trickLevel1, Set<String> habits) {
        super(nickname, age, trickLevel1, habits);
        super.setSpecies(Species.UNKNOWN);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }
}
