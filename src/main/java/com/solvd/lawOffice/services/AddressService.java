package com.solvd.lawOffice.services;

import com.solvd.lawOffice.binary.location.Address;

public interface AddressService {

    default Address getAddress(long id) {
        return null;
    }

    default void saveAddress(Address address) {

    }

    default void updateAddress(Address address) {

    }

    default void deleteAddress(long id) {

    }
}
