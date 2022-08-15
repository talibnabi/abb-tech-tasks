package project.allHuman;

import java.util.List;
import java.util.Random;

public class AllManName {
    private static final Random random = new Random();

    List<String> allManName = List.of("Roberto", "Bernardo", "Silva", "Almeida",
            "Pavlov", "Tamino", "Benzema", "Ramos", "Modric", "Ronaldo");

    public String getRandomListElement() {
        return allManName.get(random.nextInt(allManName.size()));
    }
}
