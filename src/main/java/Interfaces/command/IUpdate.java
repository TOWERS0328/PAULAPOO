package Interfaces.command;

import java.sql.SQLException;

public interface IUpdate<Y> {
    void update(Y y) throws SQLException;
}
