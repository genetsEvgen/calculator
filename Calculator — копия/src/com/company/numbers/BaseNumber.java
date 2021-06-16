package com.company.numbers;

public abstract class BaseNumber {
    private String value;

    public BaseNumber(String value) {
        this.value = value;
    }

    public String getValue(){ return value; }

    public abstract BaseNumber plus(BaseNumber number);
    public abstract BaseNumber minus(BaseNumber number);
    public abstract BaseNumber mult(BaseNumber number);
    public abstract BaseNumber divide(BaseNumber number);
}
