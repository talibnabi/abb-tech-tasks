package game;

import static util.OperationUtil.*;
import static util.ShootingGameUtil.*;

public class ShootingGame {


    public static void shootingGame() {
        symbolSize = inputChecker("field");
        allSymbol = new String[symbolSize][symbolSize];
        fillArr();
        calculateRandomNums();
        getText("All set. Get ready to rumble!");
        showAllTarget();
        while (true) {
            arr[0] = getInputForLine();
            arr[1] = getInputForShoot();
            if (arr[0] == randomArr[0] && arr[1] == randomArr[1]) {
                allSymbol[arr[1] - 1][arr[0] - 1] = "x";
                getText("You have won!");
                showAllTarget();
                System.exit(0);
            } else {
                allSymbol[arr[1] - 1][arr[0] - 1] = "*";
                showAllTarget();
                getText("Try again...");
            }
        }
    }


}
