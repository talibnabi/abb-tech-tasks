package project.allHuman;

public final class Man extends Human {
    public Man() {
    }

    public Man(String name, String surname, Integer year) {
        super(name, surname, year);
    }

    public Man(String name, String surname, Integer year, Integer iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello," + getFamily().getPet().getNickname());
    }

    public void repairCar() {
        System.out.println("I will repair the car.");
    }

}
