package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.people.Client;

public interface ClientService {

    default Client getClient (long id) {
        return null;
    }

    default void saveClient (Client client) {

    }
}
