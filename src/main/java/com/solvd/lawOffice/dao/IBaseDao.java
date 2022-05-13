package com.solvd.lawOffice.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public interface IBaseDao<T> {

    default T getById(long id) throws IOException, SQLException {
        return null;
    }

    default void save (T entity) throws SQLException, IOException {

    }

    default void update (T entity) throws SQLException, IOException {

    }

    default void deleteById (long id) throws SQLException, IOException {

    }
}
