package family;

import alive.Human;
import alive.Pet;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private static int size = 0;
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
        this.pet = new Pet();
        father.setFamily(this);
        mother.setFamily(this);
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

    public void addChild(Human child) {
        if (children.length == size) {
            Human[] children2 = new Human[children.length+1];
            System.arraycopy(children, 0, children2, 0, children.length);
            children = children2;
        }
        child.setFamily(this);
        children[size++] = child;
    }

    public boolean deleteChild(int index) {
        boolean result = false;
        if (children == null) {
            return false;
        } else {
            if (children.length == 0 || index != children.length - 1) {
                return false;
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

    }

    public int countFamily() {
        if (this.children != null) {
            return 2 + this.getChildren().length;
        } else {
            return 2;
        }
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
    public String toString() {
        if ((mother == null || mother.getName() == null) || (father == null || father.getName() == null)) {
            return "There is no information.";
        } else if (children == null) {
            if (pet == null) {
                return "Family{" +
                        "mother=" + mother.getName() +
                        ", father=" + father.getName() +
                        '}';
            } else {
                return "Family{" +
                        "mother=" + mother.getName() +
                        ", father=" + father.getName() +
                        ", pet=" + pet.toString() +
                        '}';
            }
        } else if (pet == null) {
            return "Family{" +
                    "mother=" + mother.getName() +
                    ", father=" + father.getName() +
                    ", children=" + Arrays.deepToString(children) +
                    '}';
        } else {
            return "Family{" +
                    "mother=" + mother.getName() +
                    ", father=" + father.getName() +
                    ", children=" + Arrays.deepToString(children) +
                    ", pet=" + pet.toString() +
                    '}';
        }

    }
}
