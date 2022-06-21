package com.solvd.lawOffice.utils.exceptions;

public class DaoException extends RuntimeException{

    public DaoException() {
    }

    public DaoException(String msg){
        super(msg);
    }

    public DaoException (String msg, Throwable cause) {
        super (msg, cause);
    }

    public DaoException (Throwable cause) {
        super(cause);
    }
}
