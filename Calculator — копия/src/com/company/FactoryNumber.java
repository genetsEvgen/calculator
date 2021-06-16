package com.company;

import com.company.exceptions.InvalidNumberException;
import com.company.numbers.ArabNumber;
import com.company.numbers.BaseNumber;
import com.company.numbers.RomanNumber;

public class FactoryNumber {
    public static BaseNumber create(String s) throws InvalidNumberException {
        if (Helper.checkArab(s))
            return new ArabNumber(s);
        else if (Helper.checkRoman(s))
            return new RomanNumber(s);
        else
            throw new InvalidNumberException();
    }
}
