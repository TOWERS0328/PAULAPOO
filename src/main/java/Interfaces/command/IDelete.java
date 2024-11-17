package Interfaces.command;

import java.sql.SQLException;

public interface IDelete<T> {
    void delete(T obj) throws SQLException;
}
