package enumeration.concretes.data;

import entity.Booking;
import entity.User;
import enumeration.abstracts.DataSource;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public enum UserDataSource implements DataSource<User> {
    USER_DATA_SOURCE(LinkedList::new);
    private final Supplier<List<User>> constructor;

    UserDataSource(Supplier<List<User>> constructor) {
        this.constructor = constructor;
    }

    @Override
    public Supplier<List<User>> constructor() {
        return constructor;
    }
}
