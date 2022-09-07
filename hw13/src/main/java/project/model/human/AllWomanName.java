package project.model.human;


import java.util.List;
import java.util.Random;

public class AllWomanName {
    private static final Random random = new Random();
    List<String> allWomanName = List.of("Alisa", "Sura",
            "Narmina", "Klementen", "Sabina", "Anjelina", "Jasmin", "Pavlovic", "Silvia", "Selina");

    public String getRandomListElement() {
        return allWomanName.get(random.nextInt(allWomanName.size()));
    }

}
