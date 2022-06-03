package com.solvd.lawOffice.services.jackson;

import java.util.List;

public interface IBaseJakcson <T>{

    default List<T> getJsonList () {
        return null;
    }
}
