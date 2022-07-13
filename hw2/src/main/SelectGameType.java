package main;

import game.ShootingGame;

import static game.ShootingGame.shootingGame;
import static game.ShootingGameAdvanced.shootingGameAdvanced;
import static util.OperationUtil.getText;
import static util.OperationUtil.inputChecker;

public class SelectGameType {
    public static void gameType() {
        getText("----------------------------------------------------------");
        getText("Shooting game (1)");
        getText("Shooting game advanced (2)");
        getText("----------------------------------------------------------");
        int select = inputChecker("gameType");
        switch (select) {
            case 1 -> shootingGame();
            case 2 -> shootingGameAdvanced();
            default -> select = inputChecker("gameType");
        }
    }
}
