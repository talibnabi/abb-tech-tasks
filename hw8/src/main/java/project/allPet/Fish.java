package project.allPet;

import project.allEnum.Species;

public class Fish extends Pet {
    public Fish() {
        super.setSpecies(Species.UNKNOWN);
    }

    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.UNKNOWN);
    }

    public Fish(String nickname, Integer age, Integer trickLevel1, String[] habits) {
        super(nickname, age, trickLevel1, habits);
        super.setSpecies(Species.UNKNOWN);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am " + getNickname() + ". I miss you!");
    }

}
