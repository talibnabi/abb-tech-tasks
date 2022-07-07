package util;

import java.util.Random;
import java.util.Scanner;

public class Operation {
    public static final Scanner scanner = new Scanner(System.in);

    public static final Random random = new Random();
    public static String[][] event = {{"1929", "When did the Economic Depression begin?"},
            {"1914", "When did the World War I begin?"},
            {"1939", "When did the World War II begin?"}};
    private static int[] arr = new int[1];

    public static int size = 0;
    public static int answer;
    public static int guess;

    public static String name;

    public static boolean correct = true;


    public static void findArr(int element) {
        if (arr.length == size) {
            int[] arr2 = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
        }
        arr[size++] = element;
    }

    public static void displayNums(String message) {
        int[] arrayReversed = reverseArray(arr);
        System.out.print(message);
        for (int num : arrayReversed) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    public static int[] reverseArray(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int inputChecker(String type) {
        switch (type) {
            case "number":
                Operation.getText("Guess a number between 1 and 100: ");
                break;
            case "event":
                Operation.getText("Guess a number between 1800 and 2022: ");
                break;
            case "input":
                Operation.getText("Which game do you want to play? (Please,enter game's number (1 or 2)): ");
        }


        String guess = Operation.scanner.nextLine();
        int guessNumber = 0;
        boolean convertableType = true;
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != '0' && guess.charAt(i) != '1' && guess.charAt(i) != '2' && guess.charAt(i) != '3'
                    && guess.charAt(i) != '4' && guess.charAt(i) != '5' && guess.charAt(i) != '6' && guess.charAt(i) != '7'
                    && guess.charAt(i) != '8' && guess.charAt(i) != '9') {
                convertableType = false;
                break;
            }
        }
        if (convertableType) {
            guessNumber = Integer.parseInt(guess);
        } else {
            if (type.equals(Operation.getTextNumber())) {
                return inputChecker(Operation.getTextNumber());
            } else if (type.equals(Operation.getTextEvent())) {
                return inputChecker(Operation.getTextEvent());
            } else {
                return inputChecker(Operation.getTextInput());
            }

        }
        return guessNumber;
    }

    public static void getText(String text) {
        System.out.println(text);
    }

    public static void recognition() {
        Operation.getText("Please,enter your name: ");
        Operation.name = scanner.nextLine();
    }

    public static String getTextNumber() {
        return "number";
    }

    public static String getTextEvent() {
        return "event";
    }

    public static String getTextInput() {
        return "input";
    }
}
