package ui.concretes;

import ui.abstracts.Menu;

public class BookingUIPage implements Menu {

    @Override
    public String showInterface() {

        return "==========================================\n" +
                "||->     FLIGHT BOOKING MANAGER       <-||\n" +
                "==========================================\n" +
                "| What do you want to do?                |\n" +
                "| 1. --> SHOW ALL FLIGHTS                |\n" +
                "| 2. --> SHOW FLIGHT BY ID               |\n" +
                "| 3. --> MAKE A BOOKING                  |\n" +
                "| 4. --> SHOW MY ALL BOOKINGS            |\n" +
                "| 5. --> CANCEL MY BOOKING               |\n" +
                "| 6. --> EXIT                            |\n" +
                "|========================================|\n";
    }
}
