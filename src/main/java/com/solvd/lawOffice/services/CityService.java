package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.location.City;

public interface CityService {

    default City getCity (long id) {
        return null;
    }
}
