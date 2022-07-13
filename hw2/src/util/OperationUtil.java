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
    ;
    public static int[] randomArr = new int[2];
    public static int[][] randomArrAdvanced = new int[3][2];
    public static int randomShootFirst = 0;
    public static int randomShootSecond = 0;
    public static int horizontalOrVertical = 0;
    public static int detectRandomShootStatistic = 0;

    public static void calculateRandomNumsAdvanced() {
        randomShootFirst = random.nextInt(5) + 1;
        randomShootSecond = random.nextInt(5) + 1;
        detectRandomShootStatistic = random.nextInt(3) + 1;
        horizontalOrVertical = random.nextInt(2) + 1;// 1-->horizontal  2-->vertical

        if (horizontalOrVertical == 1) {
            for (int i = 0; i < randomArrAdvanced.length; i++) {
                if (randomShootFirst > 1 && randomShootFirst < 5) {
                    if (randomShootFirst == 2 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootFirst + i;
                        randomArrAdvanced[i][1] = randomShootSecond;
                    } else if (randomShootFirst == 4 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootFirst - i;
                        randomArrAdvanced[i][1] = randomShootSecond;
                    } else if (randomShootFirst == 3 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootFirst - i;
                        randomArrAdvanced[i][1] = randomShootSecond;
                    } else if (randomShootFirst == 3 && detectRandomShootStatistic == 2) {
                        randomArrAdvanced[i][0] = randomShootFirst + i;
                        randomArrAdvanced[i][1] = randomShootSecond;
                    } else {
                        randomArrAdvanced[i][0] = randomShootFirst + i - 1;
                        randomArrAdvanced[i][1] = randomShootSecond;
                    }
                } else if (randomShootFirst == 1) {
                    randomArrAdvanced[i][0] = randomShootFirst + i;
                    randomArrAdvanced[i][1] = randomShootSecond;
                } else if (randomShootFirst == 5) {
                    randomArrAdvanced[i][0] = randomShootFirst - i;
                    randomArrAdvanced[i][1] = randomShootSecond;
                }
            }
        } else {
            for (int i = 0; i < randomArrAdvanced.length; i++) {
                if (randomShootFirst > 1 && randomShootFirst < 5) {
                    if (randomShootFirst == 2 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootSecond;
                        randomArrAdvanced[i][1] = randomShootFirst + i;
                    } else if (randomShootFirst == 4 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootSecond;
                        randomArrAdvanced[i][1] = randomShootFirst - i;
                    } else if (randomShootFirst == 3 && detectRandomShootStatistic == 1) {
                        randomArrAdvanced[i][0] = randomShootSecond;
                        randomArrAdvanced[i][1] = randomShootFirst - i;
                    } else if (randomShootFirst == 3 && detectRandomShootStatistic == 2) {
                        randomArrAdvanced[i][0] = randomShootSecond;
                        randomArrAdvanced[i][1] = randomShootFirst + i;
                    } else {
                        randomArrAdvanced[i][0] = randomShootSecond;
                        randomArrAdvanced[i][1] = randomShootFirst + i - 1;
                    }
                } else if (randomShootFirst == 1) {
                    randomArrAdvanced[i][0] = randomShootSecond;
                    randomArrAdvanced[i][1] = randomShootFirst + i;
                } else if (randomShootFirst == 5) {
                    randomArrAdvanced[i][0] = randomShootSecond;
                    randomArrAdvanced[i][1] = randomShootFirst - i;
                }
            }
        }
    }


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
