package file.abstracts;

import java.util.List;

public interface FileWorking<T> {
    Boolean writeListToFile(String filePath, List<T> list);

    List<T> readListFromFile(String filePath);
}
