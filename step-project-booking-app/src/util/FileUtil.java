package util;

import file.abstracts.FileWorkingID;
import file.concretes.WorkingWithFileForID;


public class FileUtil {
    public static final FileWorkingID workingWithFileForID = new WorkingWithFileForID();
    public static final String passenger = "./db/id/passengerID.txt";
    public static final String flight = "./db/id/flightID.txt";
    public static final String booking = "./db/id/bookingID.txt";
    public static final String user = "./db/id/userID.txt";

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
