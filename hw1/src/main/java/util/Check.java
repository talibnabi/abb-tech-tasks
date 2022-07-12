package util;


import static util.Operation.*;

public class Check {
    public static void checkNums(String text) {
        while (true) {
            guess = inputChecker(text);
            findArr(guess);
            if (answer > guess) {
                getText("Your number is too small. Please, try again.");
            } else if (answer < guess) {
                getText("Your number is too big. Please, try again.");
            } else {
                getText("Congratulations," + name);
                displayNums("Your numbers: ");
                break;
            }
        }
    }
}
