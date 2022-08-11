package project;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species species;
    private String nickname;
    private Integer age;
    private Integer trickLevel1;
    private String[] habits;

    public Pet() {

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, Integer age, Integer trickLevel1, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel1 = trickLevel1;
        this.habits = habits;
    }

    //Advanced complexity
    static {
        System.out.println("Class is being loaded: " + Pet.class.getName());
    }

    {
        System.out.println("Object is created: " + getClass().getName());
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
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
    public int hashCode() {
        return Objects.hash(getSpecies(), getNickname(), getAge(), getTrickLevel1());
    }

    protected void finalize() throws Throwable {
        System.out.println("Inside finalize method of " + getClass().getName() + " Class");
        System.out.println("Calling finalize method of the Object class");
        // Calling finalize() of Object class
        super.finalize();
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
                        "species='" + species.name() + '\'' +
                        ", nickname='" + nickname + '\'' +
                        '}';
            } else if (trickLevel1 == 0) {
                return "Pet{" +
                        "species='" + species.name() + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            } else {
                return "Pet{" +
                        "species='" + species.name() + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", trickLevel1=" + trickLevel +
                        ", habits=" + Arrays.deepToString(habits) +
                        '}';
            }
        } else if (trickLevel1 == 0) {
            if (habits == null) {
                return "Pet{" +
                        "species='" + species.name() + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", age=" + age +
                        '}';
            }
            return "Pet{" +
                    "species='" + species.name() + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", habits=" + Arrays.deepToString(habits) +
                    '}';
        } else if (habits == null) {
            return "Pet{" +
                    "species='" + species.name() + '\'' +
                    ", nickname='" + nickname + '\'' +
                    ", age=" + age +
                    ", trickLevel1=" + trickLevel +
                    '}';
        }
        return "Pet{" +
                "species='" + species.name() + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel1=" + trickLevel +
                ", habits=" + Arrays.deepToString(habits) +
                '}';
    }
}
