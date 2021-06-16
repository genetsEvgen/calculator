package com.company;

import com.company.numbers.BaseNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        ExpressionCalculator calculator = new ExpressionCalculator(expression);
        try {
            BaseNumber res = calculator.execute();
            System.out.printf("Результат = %s", res.getValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
