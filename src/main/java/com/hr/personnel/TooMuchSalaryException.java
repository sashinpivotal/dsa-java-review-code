package com.hr.personnel;

public class TooMuchSalaryException extends RuntimeException {

    public TooMuchSalaryException(String message) {
        super(message);
    }
}
