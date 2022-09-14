package db;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Example {
    private final int id;
    private static int counter = 0;

    public Example() {
        this.id = counter++;
    }

    public static String dateInput(String userInput) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(userInput, dateFormat);


        System.out.println(date);
        return userInput;
    }

    public int getId() {
        return id;
    }


    public int getCounter() {
        return counter;
    }

}
