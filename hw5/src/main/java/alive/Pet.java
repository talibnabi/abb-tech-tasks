package alive;

import family.Family;

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
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;
        Pet pet = (Pet) object;
        return Objects.equals(nickname, pet.nickname)
                && Objects.equals(trickLevel1, pet.trickLevel1)
                && Objects.equals(species, pet.species);
    }

    @Override
    public String toString() {
        Integer trickLevel = null;
        if (this.getTrickLevel1() != null) {
            if (this.getTrickLevel1() >= 1 && this.getTrickLevel1() <= 100) {
                trickLevel = this.getTrickLevel1();
            }
        } else {
            trickLevel1 = 0;
        }
        if (nickname == null) {
            return "There is no information.";
        } else if (species == null) {
            if ((age == null || age == 0) && trickLevel1 == 0 && habits != null) {
                return "Pet{" +
                        ", nickname='" + nickname + '\'' +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            } else if ((age == null || age == 0) && trickLevel1 != 0 && habits != null) {
                return "Pet{" +
                        ", nickname='" + nickname + '\'' +
                        ", trickLevel1=" + trickLevel +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            } else if ((age == null || age == 0) && trickLevel1 == 0) {
                return "Pet{" +
                        ", nickname='" + nickname + '\'' +
                        '}';
            } else if ((age == null || age == 0)) {
                return "Pet{" +
                        ", nickname='" + nickname + '\'' +
                        ", trickLevel1=" + trickLevel +
                        '}';
            } else {
                return "Pet{" +
                        ", nickname='" + nickname + '\'' +
                        ", age=" + age +
                        ", trickLevel1=" + trickLevel +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            }
        } else if ((age == null || age == 0)) {
            if (trickLevel1 == 0 && habits == null) {
                return "Pet{" +
                        "species='" + species + '\'' +
                        ", nickname='" + nickname + '\'' +
                        '}';
            } else if (trickLevel1 == 0) {
                return "Pet{" +
                        "species='" + species + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            } else {
                return "Pet{" +
                        "species='" + species + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", trickLevel1=" + trickLevel +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            }
        } else if (trickLevel1 == 0) {
            if (habits == null) {
                return "Pet{" +
                        "species='" + species + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", age=" + age +
                        '}';
            }
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", habits=" + Arrays.deepToString(habits) +
                    '}';
        } else if (habits == null) {
            return "Pet{" +
                    "species='" + species + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel1=" + trickLevel +
                    '}';
        }
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel1=" + trickLevel +
                ", habits=" + Arrays.deepToString(habits) +
                '}';
    }
}
