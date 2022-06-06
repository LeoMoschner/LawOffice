package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;
import com.solvd.lawOffice.binary.location.Address;

public interface CaseService {

    default Case getCase(long id) {
        return null;
    }

    default void saveCase(Case cas) {

    }

    default void updateCase(Case cas) {

    }

    default void deleteCase(long id) {

    }
}
