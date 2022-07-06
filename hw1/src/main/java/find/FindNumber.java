package find;

import util.Check;
import util.Operation;


public class FindNumber {

    public static void findNum() {
        Operation.answer = Operation.random.nextInt(100) + 1;
        Operation.getText("Let the game begin!");
        Operation.inputChecker(Operation.getTextNumber());
        Check.checkNums(Operation.getTextNumber());
        System.exit(0);
    }


}
