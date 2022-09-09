package project.model.impl.pet;

import project.model.enumeration.Species;
import project.model.inter.Unpleasant;

import java.util.Set;

public class DomesticCat extends Pet implements Unpleasant {
    public DomesticCat() {
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname, Integer age, Integer trickLevel1, Set<String> habits) {
        super(nickname, age, trickLevel1, habits);
        super.setSpecies(Species.DOMESTICCAT);
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
