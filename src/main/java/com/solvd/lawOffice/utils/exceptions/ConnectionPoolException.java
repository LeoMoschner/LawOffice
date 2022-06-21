package com.solvd.lawOffice.utils.exceptions;

public class ConnectionPoolException extends RuntimeException{
    public ConnectionPoolException () {}

    public ConnectionPoolException(Throwable e) {
        super (e);
    }

}
