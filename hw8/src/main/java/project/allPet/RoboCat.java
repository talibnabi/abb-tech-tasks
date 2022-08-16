package project.allPet;

import project.allEnum.Species;

import java.util.List;

public class RoboCat extends Pet implements Unpleasant {
    public RoboCat() {
        super.setSpecies(Species.UNKNOWN);
    }

    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.UNKNOWN);
    }

    public RoboCat(String nickname, Integer age, Integer trickLevel1, List<String> habits) {
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
