package project.db.write;

import java.io.*;

import static project.db.DataSource.families;


public class WriteFamilyToFile {

    public static void writeFamilyToFile() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("families.bin");
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(families);
        } catch (Exception ignored) {

        }
    }
}
