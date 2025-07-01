package oop_basic.basic01_feedback;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    void save(T t);

    Optional<T> findById(Long id);

    List<T> findAll();
}
