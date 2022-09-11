package project.db.read;

import project.model.impl.human.Family;

import java.io.*;
import java.util.List;

import static project.db.DataSource.families;

public class ReadFamilyFromFile {


    public static void readFamilyFromFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("families.bin");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            families = (List<Family>) objectInputStream.readObject();
            System.out.println(families);
        } catch (IOException | ClassNotFoundException ignored) {

        }

    }
}
