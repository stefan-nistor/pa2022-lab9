package factory;

import java.sql.Connection;

public interface AbstractFactoryJDBC<T> {
    void create(Connection conn, T x);

    T findByName(Connection conn, String name);

    T findById(Connection conn, Long id);
}
