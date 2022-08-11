package project;


import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws Throwable {
//        petDescription();
//        humanDescription();
//        familyDescription();
//        humanEnumShow();
//        detectFinalize();
    }
    private static void humanEnumShow(){
            Human human = new Human();
            human.setSchedule(new String[][]{{DayOfWeek.MONDAY.name(), "Go to gym"}, {DayOfWeek.WEDNESDAY.name(), "Go to sport"}});
            Arrays.stream(human.getSchedule()).forEach(x -> Arrays.stream(x).forEach(System.out::println));
        }

    private static void detectFinalize() throws Throwable {
        for(int i=10000;i<10000000;i++){
            Human human=new Human();
        }
    }


    private static void petDescription() {
        Pet pet = new Pet();
        pet.setNickname("Alisa");
        pet.setSpecies(Species.DOG);
        pet.setAge(3);
        pet.setTrickLevel1(60);
        pet.setHabits(new String[]{"Swimming", "Go to gym"});

        pet.eat();

        pet.respond();

        pet.foul();

        System.out.println(pet);
    }

    private static void humanDescription() {
        Human human = new Human();
        human.setName("Salman");
        human.setSurname("Salmanov");
        human.setYear(20);
        human.setSchedule(new String[][]{{"Monday", "Go to gym"}, {"Tuesday", "Go to work"}});
        human.setIq(80);

        Human mother = new Human();
        mother.setName("Alisa");
        mother.setSurname("Aslan");

        Human father = new Human();
        father.setName("Turan");
        father.setSurname("Aslan");

        Family humansFamily = new Family(mother, father);
        human.setFamily(humansFamily);

        human.setYear(2002);
        System.out.println(human);
    }

    private static void familyDescription() {
        Human mother = new Human();
        mother.setName("Alisa");
        mother.setSurname("Aslan");


        Human father = new Human();
        father.setName("Salman");
        father.setSurname("Aslan");

        Human fatherMom = new Human();
        fatherMom.setName("Amara");
        fatherMom.setSurname("Aslan");

        Human fatherFat = new Human();
        fatherMom.setName("Aga");
        fatherMom.setSurname("Aslan");
        father.setFamily(new Family(fatherMom, fatherFat));

        Family family = new Family(father, mother);


        Human child = new Human();
        child.setName("Narmina");
        child.setSurname("Aslan");

        Human child2 = new Human();
        child2.setName("Turana");
        child2.setSurname("Aslan");

        Human child3 = new Human();
        child3.setName("Emilia");
        child3.setSurname("Aslan");

        Human child4 = new Human();
        child4.setName("Amina");
        child4.setSurname("Aslan");

        Pet pet = new Pet();
        pet.setNickname("Turtle");
        pet.setSpecies(Species.DOG);
        pet.setHabits(new String[]{"go to gym", "swimming"});
        pet.setAge(2);
        pet.setTrickLevel1(40);

        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.setPet(pet);
//        System.out.println(family.deleteChild(2));
        System.out.println(family.deleteChild(child3));

        family.greetPet();

        System.out.println(family.countFamily());

        family.describePet();

        System.out.println(family.feedPet(true));

        System.out.println(family);

    }
}
