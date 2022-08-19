package project.main;

import project.allHuman.*;
import project.allPet.Pet;

import java.util.*;

import static project.util.FamilyUtil.random;


public class Family implements HumanCreator {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pets;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        father.setFamily(this);
        mother.setFamily(this);
    }

    //    Advanced complexity
    static {
        System.out.println("Class is being loaded: " + Family.class.getName());
    }

    {
        System.out.println("Object is created: " + getClass().getName());
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {

        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        children.remove(index);
        children.get(index).setFamily(null);
    }

    //    Advanced complexity
    public void deleteChild(Human human) {
        children.remove(human);
        human.setFamily(null);
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public void greetPet() {
        Set<Pet> pets1 = this.getPets();
        for (Pet pet : pets1) {
            System.out.println(pet.getNickname());
        }
    }

    public void describePet() {
        Pet pets1 = null;
        for (Pet pet : this.getPets()) {
            pets1 = pet;
        }
        StringBuilder slyLevel = new StringBuilder("");
        assert pets1 != null;
        if (pets1.getTrickLevel1() > 50) {
            slyLevel.append("very sly");
        } else if (pets1.getTrickLevel1() < 50) {
            slyLevel.append("almost not sly");
        } else {
            slyLevel.append("sly");
        }
        System.out.println("I have a " + pets1.getSpecies() + ",he is " + pets1.getAge() + " years old,he is " + slyLevel);
    }


    public boolean feedPet(boolean check) {
        Pet pets1 = null;
        for (Pet pet : this.getPets()) {
            pets1 = pet;
        }
        Random random = new Random();
        int randomTrickLevel = random.nextInt(100) + 1;
        assert pets1 != null;
        if (pets1.getTrickLevel1() != null && pets1.getNickname() != null) {
            if (randomTrickLevel > pets1.getTrickLevel1()) {
                System.out.println("Hm... I will feed " + pets1.getNickname());
                check = true;
            } else {
                System.out.println("I think " + pets1.getNickname() + " is not hungry.");
                check = false;
            }
        } else {
            return false;
        }
        return check;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return getMother().equals(family.getMother()) && getFather().equals(family.getFather()) && getChildren().equals(family.getChildren());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), getChildren());
    }

    protected void finalize() throws Throwable {
        System.out.println("Inside finalize method of " + getClass().getName() + " Class");
        System.out.println("Calling finalize method of the Object class");
        // Calling finalize() of Object class
        super.finalize();
    }

    @Override
    public String toString() {
        if ((mother == null || mother.getName() == null) || (father == null || father.getName() == null)) {
            return "There is no information.";
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1));
            stringBuilder.append('{');
            stringBuilder.append("mother=").append(mother);
            stringBuilder.append(", father=").append(father);
            if (children != null) stringBuilder.append(", children=").append(children);
            if (pets != null) stringBuilder.append(", pet=").append(pets);
            stringBuilder.append('}');

            return stringBuilder.toString();
        }
    }

    @Override
    public void bornChild() {
        int randomNumForSex = random.nextInt(2) + 1;
        int randomNum = random.nextInt(100) + 1;
        int iq = (mother.getIq() + father.getIq()) / 2;
        if ((randomNumForSex == 1 && randomNum == 50) || randomNum > 50) {
            AllWomanName allWomanName = new AllWomanName();
            Woman childWoman = new Woman(allWomanName.getRandomListElement(), father.getSurname(), null, iq, null);
            this.addChild(childWoman);
        } else {
            AllManName allManName = new AllManName();
            Man childMan = new Man(allManName.getRandomListElement(), father.getSurname(), null, iq, null);
            this.addChild(childMan);
        }
    }
}
