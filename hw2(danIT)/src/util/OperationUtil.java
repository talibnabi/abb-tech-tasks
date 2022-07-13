package util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OperationUtil {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();


    public static int size = 0;
    public static int symbolSize = 5;
    public static String[][] allSymbol = new String[symbolSize][symbolSize];
    public static int[] randomArr = new int[2];


    public static void fillArr() {
        for (String[] strings : allSymbol) {
            Arrays.fill(strings, "-");
        }
    }

    public static void showAllTarget() {
        int count = 1;
        for (int i = 0; i < allSymbol.length + 1; i++) {
            System.out.print(i + " | ");
        }
        System.out.println();
        for (String[] strings : allSymbol) {
            System.out.print(count + " | ");
            for (String string : strings) {
                System.out.print(string + " | ");
            }
            count++;
            System.out.println();
        }
    }

    public static void calculateRandomNums() {
        for (int i = 0; i < randomArr.length; i++) {
            int randomNum = random.nextInt(symbolSize) + 1;
            randomArr[i] = randomNum;
        }
    }


    public static void getText(String text) {
        System.out.println(text);
    }

    public static void getNumber(int number) {
        System.out.println(number);
    }

    public static int inputChecker(String inputType) {
        switch (inputType) {
            case "lineForFire" -> getText("Enter a line for fire: (" + 1 + "-" + symbolSize + ")");
            case "shootingBar" -> getText("Enter a shooting bar: (" + 1 + "-" + symbolSize + ")");
            case "gameType" -> getText("Which game do you want to play? :");
        }
        String guess = scanner.nextLine();
        int guessNumber = 0;
        boolean convertableType = true;
        if (guess.length() == 1) {
            for (int i = 0; i < guess.length(); i++) {
                if (guess.charAt(i) != '1' && guess.charAt(i) != '2' && guess.charAt(i) != '3'
                        && guess.charAt(i) != '4' && guess.charAt(i) != '5'
                        && guess.charAt(i) != '6' && guess.charAt(i) != '7'
                        && guess.charAt(i) != '8'
                        && guess.charAt(i) != '9') {
                    convertableType = false;
                    break;
                }
            }
        } else {
            switch (inputType) {
                case "lineForFire":
                    return inputChecker("lineForFire");
                case "shootingBar":
                    return inputChecker("shootingBar");
                case "gameType":
                    return inputChecker("gameType");
            }
        }
        if (convertableType) {
            guessNumber = Integer.parseInt(guess);
        } else {
            switch (inputType) {
                case "lineForFire":
                    return inputChecker("lineForFire");
                case "shootingBar":
                    return inputChecker("shootingBar");
                case "gameType":
                    return inputChecker("gameType");
            }
        }
        return guessNumber;
    }
}
