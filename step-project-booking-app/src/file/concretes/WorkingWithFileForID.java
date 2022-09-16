package file.concretes;

import file.abstracts.FileWorkingID;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFileForID implements FileWorkingID {
    @Override
    public Boolean writeIndexToFile(String filePath, int  index) {
        try (BufferedWriter oos = new BufferedWriter(new FileWriter(filePath))) {
            oos.write(String.valueOf(index));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Integer> readAllIndexFromFile(String filePath) {
        List<Integer> idList = new ArrayList<>();
        File file = new File(filePath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String text = null;
            while ((text = reader.readLine()) != null) {
                idList.add(Integer.parseInt(text));
            }
        } catch (Exception ignored) {

        }
        return idList;
    }
}
