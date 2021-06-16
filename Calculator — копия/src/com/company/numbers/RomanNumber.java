package com.company.numbers;

import com.company.Helper;

public class RomanNumber extends BaseNumber {
    public RomanNumber(String value) {
        super(value);
    }

    @Override
    public BaseNumber plus(BaseNumber number) {
        int arab1 = Helper.convertRomanToArab(getValue());
        int arab2 = Helper.convertRomanToArab(number.getValue());

        String rom = Helper.convertArabToRoman(arab1 + arab2);
        return new RomanNumber(rom);
    }

    @Override
    public BaseNumber minus(BaseNumber number) {
        int arab1 = Helper.convertRomanToArab(getValue());
        int arab2 = Helper.convertRomanToArab(number.getValue());

        String rom = Helper.convertArabToRoman(arab1 - arab2);
        return new RomanNumber(rom);
    }

    @Override
    public BaseNumber mult(BaseNumber number) {
        int arab1 = Helper.convertRomanToArab(getValue());
        int arab2 = Helper.convertRomanToArab(number.getValue());

        String rom = Helper.convertArabToRoman(arab1 * arab2);
        return new RomanNumber(rom);
    }

    @Override
    public BaseNumber divide(BaseNumber number) {
        int arab1 = Helper.convertRomanToArab(getValue());
        int arab2 = Helper.convertRomanToArab(number.getValue());

        String rom = Helper.convertArabToRoman(arab1 / arab2);
        return new RomanNumber(rom);
    }
}
