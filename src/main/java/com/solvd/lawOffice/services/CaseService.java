package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.lawOfficeStructure.Case;

public interface CaseService {

    default Case getCase(long id) {
        return null;
    }
}
