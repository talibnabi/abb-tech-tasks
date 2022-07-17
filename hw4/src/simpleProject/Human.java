package simpleProject;

public class Human {
    String name;
    String surname;
    Integer year;
    Integer iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule;

    Human() {
    }
    Human(String name,String surname,Integer year){
        this.name=name;
        this.surname=surname;
        this.year=year;
    }
    void greetPet() {
        System.out.println("Hello," + this.pet.nickname);
    }

    void describePet() {
        StringBuffer slyLevel = new StringBuffer("");
        if (this.pet.trickLevel1 > 50) {
            slyLevel.append("very sly");
        } else if (this.pet.trickLevel1 < 50) {
            slyLevel.append("almost not sly");
        } else {
            slyLevel.append("sly");
        }
        System.out.println("I have a " + this.pet.species + ",he is " + this.pet.age + " years old,he is " + slyLevel);
    }
}
