package enumeration.abstracts;

import file.concretes.WorkingWithFile;

import java.util.function.Supplier;

public interface FileDAO<T> {
    Supplier<WorkingWithFile<T>> constructor();
}
