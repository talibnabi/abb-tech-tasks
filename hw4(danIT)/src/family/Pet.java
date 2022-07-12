package family;

import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private Integer age;
    private Integer trickLevel;
    private String[] habits;

    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, Integer age, Integer trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        if (trickLevel >= 1 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        }
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - [the name of the pet]. I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
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

    public Integer getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(Integer trickLevel) {
        if (trickLevel >= 1 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        }
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
        return Objects.equals(getAge(), pet.getAge()) && Objects.equals(getTrickLevel(), pet.getTrickLevel()) && getSpecies().equals(pet.getSpecies()) && getNickname().equals(pet.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel());
    }

    @Override
    public String toString() {
        return "{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                '}';
    }
}
