package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;

import java.util.List;

public interface PlaintiffService {

    default List<Plaintiff> getByClientId (long clientId){
        return null;
    }

}
