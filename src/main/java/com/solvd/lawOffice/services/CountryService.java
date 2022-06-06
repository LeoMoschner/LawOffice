package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.location.Country;

public interface CountryService {

    default Country getCountry (long id) {
        return null;
    }
}
