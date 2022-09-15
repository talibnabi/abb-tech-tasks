package model.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static int counter;
    private final int userId;
    private final String username;
    private final String password;
    private final List<Booking> bookingList;

    public User(String username, String password) {
        this.userId = counter++;
        this.username = username;
        this.password = password;
        this.bookingList = new ArrayList<>();
    }

    public static int getCounter() {
        return counter;
    }

    public int getUserId() {
        return userId;
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
        return String.format("|ID: %s | Username: %s | Password: %s ", userId, username, password);
    }

//    public static void main(String[] args) {
//        User user = new User("Alisa","Aslan");
//        System.out.println(user.toString());
//    }
}
