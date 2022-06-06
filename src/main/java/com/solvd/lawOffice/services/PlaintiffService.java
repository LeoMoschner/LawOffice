package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.lawOfficeStructure.Plaintiff;
import com.solvd.lawOffice.binary.people.Client;

import java.util.List;

public interface PlaintiffService {

    default List<Plaintiff> getByClientId (long clientId){
        return null;
    }

    default void savePlaintiff (List<Plaintiff> plaintiffs) {

    }

    default void updatePlaintiff (List<Plaintiff> plaintiffs) {

    }

    default void deletePlaintiff (long id) {

    }

}
