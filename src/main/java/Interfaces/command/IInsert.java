package Interfaces.command;

import java.sql.SQLException;

public interface IInsert<T> {
    public void insert(T t) throws SQLException;
}
