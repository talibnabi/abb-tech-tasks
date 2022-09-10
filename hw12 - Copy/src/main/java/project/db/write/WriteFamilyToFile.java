package project.db.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import static project.db.DataSource.families;

public class WriteFamilyToFile {
    private static final String fileName="db/family.bin";
    private static final File file=new File(fileName);
    public static void writeFamilyToFile() throws FileNotFoundException {
        File file = new File(fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
                objectOutputStream.writeObject(families);
        } catch (Exception ignored) {

        }
    }
}
