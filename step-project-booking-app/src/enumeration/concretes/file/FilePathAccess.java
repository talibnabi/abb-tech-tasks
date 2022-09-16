package enumeration.concretes.file;

import static util.FilePathUtil.*;

public enum FilePathAccess {
    PASSENGER_ID(PASSENGER_ID_FILEPATH),
    FLIGHT_ID(FLIGHT_ID_FILEPATH),
    BOOKING_ID(BOOKING_ID_FILEPATH),
    USER_ID(USER_ID_FILEPATH),
    PASSENGER_DATA(PASSENGER_DATE_FILEPATH),
    FLIGHT_DATA(FLIGHT_DATA_FILEPATH),
    BOOKING_DATA(BOOKING_DATA_FILEPATH),
    USER_DATA(USER_DATA_FILEPATH);

    private final String filePath;

    FilePathAccess(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
