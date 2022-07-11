package util;

import java.util.Random;
import java.util.Scanner;

public class Operation {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static String[][] allSymbol = {{"-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-"}, {"-", "-", "-", "-", "-"}};
    public static int[] randomArr = new int[2];
    public static int[] randomArrSecond = new int[4];
    public static int[][] arr = new int[4][2];
    public static int size = 0;


    public static void calculateRandomNums() {
        for (int i = 0; i < randomArr.length; i++) {
            int randomNum = random.nextInt(5) + 1;
            randomArr[i] = randomNum;
        }
    }

//    public static void calculateRandomNumsSecond() {
//        int randomNum;
//        for (int i = 0; i < 2; i++) {
//            randomNum = random.nextInt(5) + 1;
//            randomArrSecond[i] = randomNum;
//        }
//        if (randomArrSecond[0] == 1 || randomArrSecond[0] == 5) {
//            if (randomArrSecond[1] == 1) {
//                arr[1][0] = 2;
//                arr[1][1] = 3;
//            } else if (randomArrSecond[1] == 2) {
//                arr[1][0] = 1;
//                arr[1][1] = 3;
//                arr[2][0] = 3;
//                arr[2][1] = 4;
//            } else if (randomArrSecond[1] == 3) {
//                arr[1][0] = 1;
//                arr[1][1] = 2;
//                arr[2][0] = 2;
//                arr[2][1] = 4;
//                arr[3][0] = 4;
//                arr[3][1] = 5;
//            } else if (randomArrSecond[1] == 4) {
//                arr[1][0] = 2;
//                arr[1][1] = 3;
//                arr[2][0] = 3;
//                arr[2][1] = 5;
//            } else {
//                arr[1][1] = 4;
//                arr[2][1] = 3;
//            }
//        }
//        if (randomArrSecond[0] == 1) {
//            arr[0][0] = 2;
//            arr[0][1] = 3;
//        } else if (randomArrSecond[0] == 5) {
//            arr[0][0] = 3;
//            arr[0][1] = 4;
//        }
//    }


    public static void showAllTarget() {
        System.out.println("0 | 1 | 2 | 3 | 4 | 5 |");
        int count = 1;
        for (int i = 0; i < allSymbol.length; i++) {
            System.out.print(count + " | ");
            for (int j = 0; j < allSymbol[i].length; j++) {
                System.out.print(allSymbol[i][j] + " | ");
            }
            count++;
            System.out.println();
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
            case "lineForFire" -> getText("Enter a line for fire: (1-5)");
            case "shootingBar" -> getText("Enter a shooting bar: (1-5)");
        }
        String guess = scanner.nextLine();
        int guessNumber = 0;
        boolean convertableType = true;
        if (guess.length() == 1) {
            for (int i = 0; i < guess.length(); i++) {
                if (guess.charAt(i) != '1' && guess.charAt(i) != '2' && guess.charAt(i) != '3'
                        && guess.charAt(i) != '4' && guess.charAt(i) != '5') {
                    convertableType = false;
                    break;
                }
            }
        } else {
            if (inputType.equals("lineForFire")) {
                return inputChecker("lineForFire");
            } else if (inputType.equals("shootingBar")) {
                return inputChecker("shootingBar");
            }
        }
        if (convertableType) {
            guessNumber = Integer.parseInt(guess);
        } else {
            if (inputType.equals("lineForFire")) {
                return inputChecker("lineForFire");
            } else if (inputType.equals("shootingBar")) {
                return inputChecker("shootingBar");
            }
        }
        return guessNumber;
    }
}
