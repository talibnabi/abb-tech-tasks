package main;

import static find.FindAndUpdateWeekDayPlan.findAndUpdateWeekDayPlan;
import static find.FindWeekDayPlan.findWeekDayPlan;
import static util.Operation.*;

public class SelectWeekDayPlanSchedule {
    public static void selectWeekDayPlanSchedule() {
        //This was not required,but I think it is needed
        getText("------------------------------------------------------------------------------------");
        getText("Find and Update week day plan (1)");
        getText("Find week day plan: (2)");
        getText("------------------------------------------------------------------------------------");
        int selectSchedule = Integer.parseInt(inputHandler("number"));
        switch (selectSchedule) {
            case 1 -> findAndUpdateWeekDayPlan();
            case 2 -> findWeekDayPlan();
        }
    }
}
