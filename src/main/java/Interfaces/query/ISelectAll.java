package Interfaces.query;

import java.sql.SQLException;
import java.util.List;

public interface ISelectAll<T> {
    List<T> selectAll() throws SQLException;
}
