package ui.concretes;


import ui.abstracts.Menu;

public class UserUIPage implements Menu {

    @Override
    public String showInterface() {

        return "==========================================\n" +
                "||->     WE ARE GLAD TO SEE YOU!      <-||\n" +
                "==========================================\n" +
                "| What do you want to do?                |\n" +
                "| 1. --> SIGN IN                         |\n" +
                "| 2. --> SIGN UP                         |\n" +
                "| 3. --> EXIT                            |\n" +
                "|========================================|\n";
    }
}
