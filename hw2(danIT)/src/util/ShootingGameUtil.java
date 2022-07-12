package util;

import static util.OperationUtil.allSymbol;
import static util.OperationUtil.inputChecker;

public class ShootingGameUtil {
    public static int lineForFire;
    public static int shootingBar;
    public static int[] arr = new int[2];

    public static int getInputForLine() {
        lineForFire = inputChecker("lineForFire");
        if (lineForFire > allSymbol.length) {
            return getInputForLine();
        } else {
            return lineForFire;
        }
    }

    public static int getInputForShoot() {
        shootingBar = inputChecker("shootingBar");
        if (shootingBar > allSymbol.length) {
            return getInputForShoot();
        } else {
            return shootingBar;
        }
    }
}
