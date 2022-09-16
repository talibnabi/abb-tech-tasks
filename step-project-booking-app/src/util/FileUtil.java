package util;


import static util.FileDAOUtil.workingWithFileForID;


public class FileUtil {


    public static Boolean checkFile(String filePath) {
        if (workingWithFileForID.readAllIndexFromFile(filePath).isEmpty()) {
            workingWithFileForID.writeIndexToFile(filePath, 0);
            return true;
        } else {
            return false;
        }
    }

    public static void counterID(String filePath, int id) {
        if (checkFile(filePath)) {
            id = 0;
        } else {
            if (workingWithFileForID.readAllIndexFromFile(filePath).size() == 1
                    && workingWithFileForID.readAllIndexFromFile(filePath).get(0) == 0) {
                id = 0;
            } else {
                id = workingWithFileForID.readAllIndexFromFile(filePath).size();
            }
        }
        Boolean write = workingWithFileForID.writeIndexToFile(filePath, id);

    }
}
