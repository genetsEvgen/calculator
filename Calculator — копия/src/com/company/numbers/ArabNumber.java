package com.company.numbers;

public class ArabNumber extends BaseNumber {
    public ArabNumber(String value) {
        super(value);
    }

    @Override
    public BaseNumber plus(BaseNumber number) {
        int a = Integer.parseInt(getValue());
        int b = Integer.parseInt(number.getValue());

        return new ArabNumber(String.valueOf(a + b));
    }

    @Override
    public BaseNumber minus(BaseNumber number) {
        int a = Integer.parseInt(getValue());
        int b = Integer.parseInt(number.getValue());

        return new ArabNumber(String.valueOf(a - b));
    }

    @Override
    public BaseNumber mult(BaseNumber number) {
        int a = Integer.parseInt(getValue());
        int b = Integer.parseInt(number.getValue());

        return new ArabNumber(String.valueOf(a * b));
    }

    @Override
    public BaseNumber divide(BaseNumber number) {
        int a = Integer.parseInt(getValue());
        int b = Integer.parseInt(number.getValue());

        return new ArabNumber(String.valueOf(a / b));
    }
}
