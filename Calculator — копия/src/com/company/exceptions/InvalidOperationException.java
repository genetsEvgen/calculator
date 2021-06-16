package com.company.exceptions;

public class InvalidOperationException extends Exception {

    public InvalidOperationException() {
        super("Данная операция не поддерживается");
    }
}
