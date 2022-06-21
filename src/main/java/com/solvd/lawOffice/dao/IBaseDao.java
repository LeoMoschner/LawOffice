package com.solvd.lawOffice.dao;


public interface IBaseDao<T> {

    T getById(long id);

    default void save(T entity) {

    }

    default void update(T entity) {

    }

    default void deleteById(long id) {

    }
}
