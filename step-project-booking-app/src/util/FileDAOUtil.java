package util;

import entity.Booking;
import entity.Flight;
import entity.Passenger;
import entity.User;
import file.abstracts.FileWorkingID;
import file.concretes.WorkingWithFile;
import file.concretes.WorkingWithFileForID;

public class FileDAOUtil {
    public static final FileWorkingID workingWithFileForID = new WorkingWithFileForID();
    public static final WorkingWithFile<Booking> workingWithFileBooking = new WorkingWithFile<>();
    public static final WorkingWithFile<Flight> workingWithFileFlight = new WorkingWithFile<>();
    public static final WorkingWithFile<User> workingWithFileUser = new WorkingWithFile<>();
    public static final WorkingWithFile<Passenger> workingWithFilePassenger = new WorkingWithFile<>();
}
