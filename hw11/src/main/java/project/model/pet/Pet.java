package project.model.pet;

import project.model.enumeration.Species;

import java.util.Objects;
import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private Integer age;
    private Integer trickLevel1;
    private Set<String> habits;

    public Pet() {

    }

    public Pet(String nickname) {
        this.species = Species.UNKNOWN;
        this.nickname = nickname;
    }

    public Pet(String nickname, Integer age, Integer trickLevel1, Set<String> habits) {
        this.species = Species.UNKNOWN;
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

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();


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
        StringBuilder stringBuilder = new StringBuilder();

        if (species == null) return "";
        else {
            String speciesName = species.name().charAt(0) + species.name().substring(1).toLowerCase();
            stringBuilder.append(speciesName).append("{");
            stringBuilder.append(speciesName).append(species.isCanFly() ? " can fly. " : " cannot fly. ");
            stringBuilder.append(speciesName).append(String.format(" has %d legs. ", (Integer) species.getNumberOfLegs()));
            stringBuilder.append(speciesName).append(species.isHasFur() ? " has fur. " : " has not fur. ");

        }
        if (nickname == null) return stringBuilder.append('}').toString();
        else stringBuilder.append("nickname='").append(nickname).append('\'');
        if (age != null) stringBuilder.append(", age=").append(age);
        if (trickLevel != null) stringBuilder.append(", trickLevel=").append(trickLevel);
        if (habits != null) stringBuilder.append(", habits=").append(habits.toString());
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
