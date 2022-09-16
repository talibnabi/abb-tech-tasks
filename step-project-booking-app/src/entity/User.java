package entity;

import enumeration.concretes.file.FilePathAccess;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static util.FileUtil.*;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final int userID = 0;
    private final String username;
    private final String password;
    private final List<Booking> bookingList;

    public User(String username, String password) {
        counterID(FilePathAccess.USER_ID.getFilePath(), userID);
        this.username = username;
        this.password = password;
        this.bookingList = new ArrayList<>();
    }


    public int getUserId() {
        return userID;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public List<Booking> getBookingList() {
        return bookingList;
    }

    public void setBookingList(Booking booking) {
        this.bookingList.add(booking);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return getUserId() == user.getUserId()
                && getUsername().equals(user.getUsername())
                && getPassword().equals(user.getPassword())
                && getBookingList().equals(user.getBookingList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(),
                getUsername(),
                getPassword(),
                getBookingList());
    }

    @Override
    public String toString() {
        return String.format("|ID: %s | Username: %s | Password: %s ", userID, username, password);
    }

}
