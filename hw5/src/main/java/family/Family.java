package family;

import alive.Human;
import alive.Pet;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children = new Human[1];
    private Pet pet;
    private static int size = 0;

    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human human) {
        if (children.length == size) {
            Human[] arr2 = new Human[children.length + 1];
            System.arraycopy(children, 0, arr2, 0, children.length);
            children = arr2;
        }
        children[size++] = human;
    }

    public boolean deleteChild(Integer index) {
        boolean result = false;
        if (children.length == 0 || index > children.length - 1 || index < children.length - 1) {
            return result;
        }
        Human[] newChild = new Human[children.length - 1];
        for (int i = 0; i < newChild.length; i++) {
            if (i == index) {
                newChild[i] = children[i + 1];
            }
            newChild[i] = children[i];
            result = true;
        }
        children = newChild;
        return result;
    }

    public int countFamily() {
        return 0;
    }

    public void greetPet() {
        System.out.println("Hello," + this.getPet().getNickname());
    }

    public void describePet() {
        StringBuilder slyLevel = new StringBuilder("");
        if (this.getPet().getTrickLevel1() > 50) {
            slyLevel.append("very sly");
        } else if (this.getPet().getTrickLevel1() < 50) {
            slyLevel.append("almost not sly");
        } else {
            slyLevel.append("sly");
        }
        System.out.println("I have a " + this.getPet().getSpecies() + ",he is " + this.getPet().getAge() + " years old,he is " + slyLevel);
    }

    //advanced complexity
    public boolean feedPet(boolean check) {
        Random random = new Random();
        int randomTrickLevel = random.nextInt(100) + 1;
        if (this.getPet().getTrickLevel1() != null && this.getPet().getNickname() != null) {
            if (randomTrickLevel > this.getPet().getTrickLevel1()) {
                System.out.println("Hm... I will feed " + this.getPet().getNickname());
                check = true;
            } else {
                System.out.println("I think " + this.getPet().getNickname() + " is not hungry.");
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
        return getMother().equals(family.getMother()) && getFather().equals(family.getFather()) && Arrays.equals(getChildren(), family.getChildren()) && getPet().equals(family.getPet());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getMother(), getFather(), getPet());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }

    @Override
    public String toString() {
        if (mother == null || father == null) {
            return "no result.";
        } else if (children[0] == null && pet != null) {
            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    ", pet=" + pet +
                    '}';
        } else if (pet == null && children[0] != null) {
            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    ", children=" + Arrays.toString(children) +
                    '}';
        } else if (pet == null) {
            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    '}';
        } else {
            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    ", children=" + Arrays.toString(children) +
                    ", pet=" + pet +
                    '}';
        }

    }
}
