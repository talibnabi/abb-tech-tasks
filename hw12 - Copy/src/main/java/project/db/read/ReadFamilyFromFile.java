package project.db.read;

import project.model.impl.human.Family;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.List;

import static project.db.DataSource.families;


public class ReadFamilyFromFile {
    private static final String fileName="db/family.bin";
    private static final File file=new File(fileName);
    private static List<Family> familiesx;

    public static List<Family> readFamilyFromFile() throws FileNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            familiesx = (List<Family>) objectInputStream.readObject();
        } catch (Exception ignored) {

        }
        return familiesx;
    }
}
