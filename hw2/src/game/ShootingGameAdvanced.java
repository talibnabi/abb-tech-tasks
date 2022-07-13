package game;

import static util.OperationUtil.*;
import static util.ShootingGameUtil.*;

public class ShootingGameAdvanced {
    public static int[] arrAdvanced = new int[2];

    public static void shootingGameAdvanced() {
        fillArr();
        calculateRandomNumsAdvanced();
        getText("All set. Get ready to rumble!");
        showAllTarget();
        int count = 0;
        while (true) {
            arrAdvanced[0] = getInputForLine();
            arrAdvanced[1] = getInputForShoot();
            if (horizontalOrVertical == 1) {
                if (arrAdvanced[0] == randomShootSecond && (arrAdvanced[1] == randomArrAdvanced[0][0] ||
                        arrAdvanced[1] == randomArrAdvanced[1][0] ||
                        arrAdvanced[1] == randomArrAdvanced[2][0])) {
                    allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "x";
                    showAllTarget();
                    while (true) {
                        arrAdvanced[1] = getInputForShoot();
                        if (arrAdvanced[1] == randomArrAdvanced[0][0] ||
                                arrAdvanced[1] == randomArrAdvanced[1][0] ||
                                arrAdvanced[1] == randomArrAdvanced[2][0]) {
                            allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "x";
                            if (allSymbol[arrAdvanced[0] - 1][randomArrAdvanced[0][0] - 1] == "x"
                                    && allSymbol[arrAdvanced[0] - 1][randomArrAdvanced[1][0] - 1] == "x"
                                    && allSymbol[arrAdvanced[0] - 1][randomArrAdvanced[2][0] - 1] == "x") {
                                getText("You have won!");
                                showAllTarget();
                                System.exit(0);
                            }
                            showAllTarget();
                        } else {
                            allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "*";
                            showAllTarget();
                            getText("Try again...");
                        }
                    }
                } else {
                    allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "*";
                    showAllTarget();
                    getText("Try again...");
                }
            } else if (horizontalOrVertical == 2) {
                if (arrAdvanced[1] == randomShootSecond && (arrAdvanced[0] == randomArrAdvanced[0][1] ||
                        arrAdvanced[0] == randomArrAdvanced[1][1] ||
                        arrAdvanced[0] == randomArrAdvanced[2][1])) {
                    allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "x";
                    showAllTarget();
                    while (true) {
                        arrAdvanced[0] = getInputForShoot();
                        if (arrAdvanced[0] == randomArrAdvanced[0][1] ||
                                arrAdvanced[0] == randomArrAdvanced[1][1] ||
                                arrAdvanced[0] == randomArrAdvanced[2][1]) {
                            allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "x";
                            if (allSymbol[randomArrAdvanced[0][1] - 1][randomShootSecond - 1] == "x"
                                    && allSymbol[randomArrAdvanced[1][1] - 1][randomShootSecond - 1] == "x"
                                    && allSymbol[randomArrAdvanced[2][1] - 1][randomShootSecond - 1] == "x") {
                                getText("You have won!");
                                showAllTarget();
                                System.exit(0);
                            }
                            showAllTarget();
                        } else {
                            allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "*";
                            showAllTarget();
                            getText("Try again...");
                        }
                    }
                } else {
                    allSymbol[arrAdvanced[0] - 1][arrAdvanced[1] - 1] = "*";
                    showAllTarget();
                    getText("Try again...");
                }
            }
        }
    }
}

