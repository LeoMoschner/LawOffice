package com.solvd.lawOffice.binary.people;


import com.solvd.lawOffice.binary.location.Address;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String email;
    private Address address;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getFullName () {
        return (firstName + " " + lastName);
    }

    @Override
    public String toString () {

        return ("\n\tFirst name: " + firstName + "\n\tLast name: " + lastName
                + "\n\tE-mail: " + email + "\n\tAddress:\n\t\t"
                + address.getStreetName() + " " + address.getStreetNumber()
                + "\n\t\tPostal code: " + address.getPostalCode()
                + "\n\t\tCity: " + address.getCity());
    }
}
