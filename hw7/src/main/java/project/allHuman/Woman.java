package project.allHuman;

public final class Woman extends Human {
    public Woman() {
    }

    public Woman(String name, String surname, Integer year) {
        super(name, surname, year);
    }

    public Woman(String name, String surname, Integer year, Integer iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello," + getFamily().getPet().getNickname());
    }

    public void makeup() {

    }
}
