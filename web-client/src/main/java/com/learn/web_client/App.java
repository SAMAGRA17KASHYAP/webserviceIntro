package com.learn.web_client;

import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		CalculatorSoap calculatorSoap = calculator.getCalculatorSoap();
		int add = calculatorSoap.add(1, 2);
		System.out.println("Sum is " + add);
	}
}
