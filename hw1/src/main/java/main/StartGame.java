package main;

import find.FindNumber;
import find.FindWellKnownEvents;
import util.Operation;

import static find.FindNumber.findNum;
import static find.FindWellKnownEvents.findEvent;
import static util.Operation.*;

public class StartGame {
    public static void whichGameDoYouWantToPlay() {
        getText("Number Find Game (1)");
        getText("Well Known Events Find Game (2)");
        getText("------------------------------------------------------------------------------------------------------------------------");
        int selectGame = inputChecker(getTextInput());
        switch (selectGame) {
            case 1:
                recognition();
                findNum();
                break;
            case 2:
                recognition();
                findEvent();
                break;
            default:
                break;

        }
    }
}
