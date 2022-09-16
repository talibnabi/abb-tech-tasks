package enumeration.abstracts;

import java.util.List;
import java.util.function.Supplier;

public interface DataSource<T> {
    Supplier<List<T>> constructor();
}
