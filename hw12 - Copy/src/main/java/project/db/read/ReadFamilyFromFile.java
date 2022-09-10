//package project.db.read;
//
//import project.model.impl.human.Family;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.ObjectInputStream;
//import java.util.List;
//
//import static project.db.DataSource.families;
//
//
//public class ReadFamilyFromFile {
//
//
//    public static List<Family> readFamilyFromFile() throws FileNotFoundException {
//        final String fileName = "family.bin";
//        final File file = new File(fileName);
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
//            families = (List<Family>) objectInputStream.readObject();
//        } catch (Exception ignored) {
//
//        }
//        return families;
//    }
//}
