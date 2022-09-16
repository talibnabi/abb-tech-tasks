package file.concretes;

import file.abstracts.FileWorking;

import java.io.*;

import java.util.Collections;
import java.util.List;

public class WorkingWithFile<T> implements FileWorking<T> {
    @Override
    public Boolean writeListToFile(String filePath, List<T> list) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(list);
            return true;
        } catch (Exception ignored) {
            return false;
        }
    }

    @Override
    public List<T> readListFromFile(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (List<T>) ois.readObject();
        } catch (Exception ignored) {
            return Collections.emptyList();
        }
    }

}
