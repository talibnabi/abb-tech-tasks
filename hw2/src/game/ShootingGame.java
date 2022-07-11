package game;

import static util.Operation.*;

public class ShootingGame {
    public static void shootingGame() {
        calculateRandomNums();
        getText("All set. Get ready to rumble!");
        showAllTarget();
        while (true) {
            int lineForFire = inputChecker("lineForFire");
            int shootingBar = inputChecker("shootingBar");
            if (lineForFire == randomArr[0] && shootingBar == randomArr[1]) {
                allSymbol[shootingBar - 1][lineForFire - 1] = "x";
                getText("You have won!");
                showAllTarget();
                System.exit(0);
            } else {
                allSymbol[shootingBar - 1][lineForFire - 1] = "*";
                showAllTarget();
                getText("Try again...");
            }
        }
    }
}
