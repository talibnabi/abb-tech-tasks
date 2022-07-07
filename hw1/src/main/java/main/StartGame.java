package main;

import find.FindNumber;
import find.FindWellKnownEvents;
import util.Operation;

public class StartGame {
    public static void whichGameDoYouWantToPlay() {
        Operation.getText("Number Find Game (1)");
        Operation.getText("Well Known Events Find Game (2)");
        Operation.getText("------------------------------------------------------------------------------------------------------------------------");
        int selectGame = Operation.inputChecker(Operation.getTextInput());
        switch (selectGame) {
            case 1:
                Operation.recognition();
                FindNumber.findNum();
                break;
            case 2:
                Operation.recognition();
                FindWellKnownEvents.findEvent();
                break;
            default:
                break;

        }
    }
}
