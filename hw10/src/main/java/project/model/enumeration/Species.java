package project.model.enumeration;

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

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

}
