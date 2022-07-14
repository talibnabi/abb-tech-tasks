package find;

import static util.Operation.*;

public class FindWeekDayPlan {
    public static void findWeekDayPlan() {
        fillWeekDays(schedule);
        while (true) {
            String input = inputHandler("text");
            switch (input) {
                case "sunday" -> getText("Your tasks for " + schedule[0][0] + ": " + schedule[0][1]);
                case "monday" -> getText("Your tasks for " + schedule[1][0] + ": " + schedule[1][1]);
                case "tuesday" -> getText("Your tasks for " + schedule[2][0] + ": " + schedule[2][1]);
                case "wednesday" -> getText("Your tasks for " + schedule[3][0] + ": " + schedule[3][1]);
                case "thursday" -> getText("Your tasks for " + schedule[4][0] + ": " + schedule[4][1]);
                case "friday" -> getText("Your tasks for " + schedule[5][0] + ": " + schedule[5][1]);
                case "saturday" -> getText("Your tasks for " + schedule[6][0] + ": " + schedule[6][1]);
            }
        }
    }
}
