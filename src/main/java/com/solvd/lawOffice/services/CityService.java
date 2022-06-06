package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.binary.location.City;

public interface CityService {

    default City getCity(long id) {
        return null;
    }

    default void saveCity(City city) {

    }

    default void updateCity(City city) {

    }

    default void deleteCity(long id) {

    }
}
