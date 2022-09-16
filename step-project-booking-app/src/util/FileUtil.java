package util;

import db.file.abstracts.FileWorkingID;
import db.file.concretes.WorkingWithFileForID;


public class FileUtil {
    public static final FileWorkingID workingWithFileForID = new WorkingWithFileForID();
    public static final String passenger = "db/id/passengerID.txt";

    public static Boolean checkFile(String filePath) {
        if (workingWithFileForID.readAllIndexFromFile(filePath).isEmpty()) {
            workingWithFileForID.writeIndexToFile(filePath, 0);
            return true;
        } else {
            return false;
        }
    }
}
