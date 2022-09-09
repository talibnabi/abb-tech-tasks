package project.datasource;

import project.model.impl.human.Family;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    private List<Family> families = new ArrayList<>();

    public void writeFamilyToFile() throws FileNotFoundException {
        String fileName = "family.bin";
        File file = new File(fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            objectOutputStream.writeObject(families.get(0));
        } catch (Exception ignored) {
            throw new FileNotFoundException("File not found.");
        }
    }

    public List<Family> readFamilyFromFile() throws FileNotFoundException {
        String fileName = "family.bin";
        File file = new File(fileName);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            families = (List<Family>) objectInputStream.readObject();

        } catch (Exception ignored) {
            throw new FileNotFoundException("File not found.");
        }
        return families;
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }
}
