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
    private Family family;

    public void writeFamilyToFile() throws FileNotFoundException {
        String fileName = "family.bin";
        File file = new File(fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            objectOutputStream.writeObject(family);
        } catch (Exception ignored) {
            throw new FileNotFoundException("File not found.");
        }
    }

    public List<Family> readFamilyFromFile() throws FileNotFoundException {
        String fileName = "family.bin";
        File file = new File(fileName);
        List<Family> f
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            family = (Family) objectInputStream.readObject();

        } catch (Exception ignored) {
            throw new FileNotFoundException("File not found.");
        }
        return family;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
