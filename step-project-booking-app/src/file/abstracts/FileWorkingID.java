package file.abstracts;

import java.util.List;

public interface FileWorkingID {
    Boolean writeIndexToFile(String filePath, int index);

    List<Integer> readAllIndexFromFile(String filePath);
}
