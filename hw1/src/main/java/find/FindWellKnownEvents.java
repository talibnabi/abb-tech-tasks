package find;

import util.Check;
import util.Operation;

import static util.Operation.*;

public class FindWellKnownEvents {


    public static void findEvent() {
        int randomNumber = random.nextInt(event.length);
        getText("Let the game begin!");
        getText(event[randomNumber][1]);
        answer = Integer.parseInt(event[randomNumber][0]);
        Check.checkNums(getTextEvent());
        System.exit(0);
    }
}
