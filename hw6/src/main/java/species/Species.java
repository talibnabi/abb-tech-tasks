package species;

public enum Species {
    CAT(false, true, 4),
    DOG(false, true, 4),
    PARROT(true, false, 2),
    FISH(false, false, 0),
    HAMSTER(false, true, 4);
    private boolean canFly;
    private boolean hasFur;
    private int numberOfLegs;

    Species(boolean canFly, boolean hasFur, int numberOfLegs) {
        this.canFly = canFly;
        this.hasFur = hasFur;
        this.numberOfLegs = numberOfLegs;
    }
}
