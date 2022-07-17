package simpleProject.alive;

public class Pet {
    public String species;
    String nickname;
    Integer age;
    Integer trickLevel1;
    String[] habits;

    void eat() {
        System.out.println("I am eating");
    }

    void respond() {
        System.out.println("Hello, owner. I am " + this.nickname + ". I miss you!");
    }

    void foul() {
        System.out.println("I need to cover it up");
    }
}
