package com.company;

/**
 * Created by student on 24-Jun-18.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "WrongLoginException{}" + super.toString();
    }
}
