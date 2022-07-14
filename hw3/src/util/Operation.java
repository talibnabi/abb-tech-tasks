package util;

import java.util.Scanner;

public class Operation {
    public static String[][] schedule = new String[7][2];
    public static Scanner scanner = new Scanner(System.in);

    public static void getText(String text) {
        System.out.println(text);
    }

    public static void fillWeekDays(String[][] schedule) {
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to work";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do exercise";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to gym";
        schedule[5][0] = "Friday";
        schedule[5][1] = "eat meal";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go to market";
    }

    public static String inputHandler(String inputType) {
        String input = "";
        boolean convertableType = true;
        if (inputType.equals("number")) {
            getText("Select: ");
            String selectedNum = scanner.nextLine().trim();
            for (int i = 0; i < selectedNum.length(); i++) {
                if (selectedNum.charAt(i) != '0' && selectedNum.charAt(i) != '1' && selectedNum.charAt(i) != '2' && selectedNum.charAt(i) != '3'
                        && selectedNum.charAt(i) != '4' && selectedNum.charAt(i) != '5' && selectedNum.charAt(i) != '6' && selectedNum.charAt(i) != '7'
                        && selectedNum.charAt(i) != '8' && selectedNum.charAt(i) != '9') {
                    convertableType = false;
                    break;
                }
            }
            if (convertableType) {
                if (Integer.parseInt(selectedNum) == 1 || Integer.parseInt(selectedNum) == 2) {
                    return selectedNum;
                } else {
                    System.out.println("Try again...");
                    return inputHandler("number");
                }
            } else {
                System.out.println("Try again...");
                return inputHandler("number");
            }
        } else {
            if (inputType.equals("text")) {
                getText("Please, input the day of the week: (Type 'exit' to stop).");//This was not required,but I think it is needed
                input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    System.exit(0);
                } else {
                    for (String[] strings : schedule) {
                        if (input.equalsIgnoreCase(strings[0])) {
                            return input.toLowerCase();
                        }
                    }
                    getText("Sorry, I don't understand you, please try again.");
                    return inputHandler("text");
                }
            } else if (inputType.equals("update")) {
                getText("Please, input the day of the week (change or reschedule [day of the week]) : (Type 'exit' to stop).");
                input = scanner.nextLine().trim();
                if (input.equalsIgnoreCase("exit")) {
                    System.exit(0);
                } else {
                    for (String[] strings : schedule) {
                        if (input.equalsIgnoreCase(strings[0])) {
                            getText("Your tasks for " + strings[0] + ": " + strings[1]);
                            return inputHandler("update");
                        }
                    }

                    for (String[] strings : schedule) {
                        if (input.equalsIgnoreCase(strings[0])) {
                            getText(strings[1]);
                            return input.toLowerCase();
                        }

                        String[] inputArr = input.split(" ");
                        if (inputArr.length >= 2) {
                            if (inputArr[1].equalsIgnoreCase(strings[0]) && (inputArr[0].equalsIgnoreCase("change") || inputArr[0].equalsIgnoreCase("reschedule"))) {
                                return inputArr[1].toLowerCase();
                            }
                        } else {
                            getText("Sorry, I don't understand you, please try again.");
                            return inputHandler("update");
                        }
                    }
                    getText("Sorry, I don't understand you, please try again.");
                    return inputHandler("update");
                }
            }

        }

        return input.toLowerCase();
    }
}
