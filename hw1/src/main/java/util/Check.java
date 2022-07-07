package util;


import static util.Operation.*;

public class Check {
    public static void checkNums(String text) {
        while (true) {
            guess = Operation.inputChecker(text);
            Operation.findArr(guess);
            if (answer > guess) {
                Operation.getText("Your number is too small. Please, try again.");
            } else if (answer < guess) {
                Operation.getText("Your number is too big. Please, try again.");
            } else {
                Operation.getText("Congratulations," + name);
                Operation.displayNums("Your numbers: ");
                break;
            }
        }
    }
}
