package com.solvd.lawOffice.dao;


public interface IBaseDao<T> {

    default T getById(long id)  {
        return null;
    }

    default void save (T entity) {

    }

    default void update (T entity) {

    }

    default void deleteById (long id) {

    }
}
