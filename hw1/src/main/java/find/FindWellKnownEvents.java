package find;

import util.Check;
import util.Operation;

public class FindWellKnownEvents {


    public static void findEvent() {
        int randomNumber = Operation.random.nextInt(Operation.event.length);
        Operation.getText("Let the game begin!");
        System.out.println(Operation.event[randomNumber][1]);
        Operation.answer = Integer.parseInt(Operation.event[randomNumber][0]);
        Check.checkNums(Operation.getTextEvent());
        System.exit(0);
    }
}
