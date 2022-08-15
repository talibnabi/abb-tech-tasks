package project.allPet;

import project.allEnum.Species;

public class Dog extends Pet implements Unpleasant {
    public Dog() {
        super.setSpecies(Species.UNKNOWN);
    }

    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.UNKNOWN);
    }

    public Dog(String nickname, Integer age, Integer trickLevel1, String[] habits) {
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
