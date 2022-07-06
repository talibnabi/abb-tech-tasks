package main;

import find.FindNumber;
import find.FindWellKnownEvents;
import util.Operation;

public class StartGame {
    public static void whichGameDoYouWantToPlay() {
        Operation.getText("Number Find Game (1)");
        Operation.getText("Well Known Events Find Game (2)");
        Operation.getText("------------------------------------------------------------------------------------------------------------------------");
        Operation.getText("Which game do you want to play? (Please,enter game's number (1 or 2)): ");
        int selectGame = Operation.scanner.nextInt();
        Operation.recognition();
        if (selectGame == 1) {
            FindNumber.findNum();
        } else if (selectGame == 2) {
            FindWellKnownEvents.findEvent();
        } else {
            System.exit(0);
        }
    }
}
