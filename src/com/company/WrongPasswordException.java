package com.company;

/**
 * Created by student on 24-Jun-18.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {

    }

    @Override
    public String toString() {
        return "WrongPasswordException{}" + super.toString();
    }
}
