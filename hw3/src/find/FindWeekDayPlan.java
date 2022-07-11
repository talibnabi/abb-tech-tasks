package find;

import static util.Operation.*;

public class FindWeekDayPlan {
    public static void findWeekDayPlan() {
        fillWeekDays(schedule);
        while (true) {
            String input = inputHandler("text");
            switch (input) {
                case "sunday" -> getText(schedule[0][1]);
                case "monday" -> getText(schedule[1][1]);
                case "tuesday" -> getText(schedule[2][1]);
                case "wednesday" -> getText(schedule[3][1]);
                case "thursday" -> getText(schedule[4][1]);
                case "friday" -> getText(schedule[5][1]);
                case "saturday" -> getText(schedule[6][1]);
            }
        }
    }
}
