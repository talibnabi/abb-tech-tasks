package enumeration.concretes.file;

import static util.FileUtil.*;

public enum FileName {
    PASSENGER_ID(passenger),
    FLIGHT_ID(flight),
    BOOKING_ID(booking),
    USER_ID(user),
    PASSENGER_DATA(passengerDATA),
    FLIGHT_DATA(flightDATA),
    BOOKING_DATA(bookingDATA),
    USER_DATA(userDATA);

    private final String filePath;

    FileName(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
