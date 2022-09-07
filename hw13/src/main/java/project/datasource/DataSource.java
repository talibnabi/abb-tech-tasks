package project.datasource;

import project.model.human.Family;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private final List<Family> families = new ArrayList<>();


    protected void writeFamilyToFile() throws FileNotFoundException {
        String fileName = "family.bin";
        File file = new File(fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            objectOutputStream.writeObject(families);
        } catch (Exception ignored) {
            throw new FileNotFoundException("File not found.");
        }
    }
}
