package find;

import static util.Operation.*;

public class FindAndUpdateWeekDayPlan {

    public static void findAndUpdateWeekDayPlan() {
        fillWeekDays(schedule);
        while (true) {
            String input = inputHandler("update");
            getText("Please, input new tasks for " + input + ".");
            switch (input) {
                case "sunday":
                    schedule[0][1] = scanner.nextLine();
                    break;
                case "monday":
                    schedule[1][1] = scanner.nextLine();
                    break;
                case "tuesday":
                    schedule[2][1] = scanner.nextLine();
                    break;
                case "wednesday":
                    schedule[3][1] = scanner.nextLine();
                    break;
                case "thursday":
                    schedule[4][1] = scanner.nextLine();
                    break;
                case "friday":
                    schedule[5][1] = scanner.nextLine();
                    break;
                case "saturday":
                    schedule[6][1] = scanner.nextLine();
                    break;
            }
        }
    }
}
