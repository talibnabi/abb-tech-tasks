package alive;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private Integer age;
    private Integer trickLevel1;
    private String[] habits;

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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTrickLevel1() {
        return trickLevel1;
    }

    public void setTrickLevel1(Integer trickLevel1) {
        this.trickLevel1 = trickLevel1;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet pet)) return false;
        return getSpecies().equals(pet.getSpecies()) && getNickname().equals(pet.getNickname()) && getAge().equals(pet.getAge()) && getTrickLevel1().equals(pet.getTrickLevel1()) && Arrays.equals(getHabits(), pet.getHabits());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel1());
        result = 31 * result + Arrays.hashCode(getHabits());
        return result;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + this.getNickname() + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        Integer trickLevel = null;
        if (this.getTrickLevel1() != null) {
            if (this.getTrickLevel1() >= 1 && this.getTrickLevel1() <= 100) {
                trickLevel = this.getTrickLevel1();
            }
        }
        return this.species + "{" +
                "nickname='" + getNickname() + '\'' +
                ", age=" + getAge() +
                ", trickLevel1=" + trickLevel +
                ", habits=" + Arrays.toString(getHabits()) +
                '}';
    }
}
