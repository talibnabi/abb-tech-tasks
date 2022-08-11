package project;

public enum Species {
    DOMESTICCAT(false, true, 4),
    DOG(false, true, 4),
    ROBOCAT(false, false, 4),
    FISH(false, false, 0),
    UNKNOWN;
    private boolean canFly;
    private boolean hasFur;
    private int numberOfLegs;

    Species(boolean canFly, boolean hasFur, int numberOfLegs) {
        this.canFly = canFly;
        this.hasFur = hasFur;
        this.numberOfLegs = numberOfLegs;
    }

    Species() {

    }
}
