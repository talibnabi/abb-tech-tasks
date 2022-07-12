package find;

import util.Check;

import static util.Operation.*;


public class FindNumber {

    public static void findNum() {
        answer = random.nextInt(100) + 1;
        getText("Let the game begin!");
        Check.checkNums(getTextNumber());
        System.exit(0);
    }


}
