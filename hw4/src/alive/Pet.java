package alive;

import java.util.Arrays;

public class Pet {
    public String species;
    public String nickname;
    public Integer age;
    public Integer trickLevel1;
    public String[] habits;

    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, Integer age, Integer trickLevel1, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        Integer trickLevel = null;
        if (this.trickLevel1 != null) {
            if (this.trickLevel1 >= 1 && this.trickLevel1 <= 100) {
                trickLevel = this.trickLevel1;
            }
        }
        return this.species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel1=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}
