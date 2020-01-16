package chapter02.section05;

public class Client {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int firstNumber = 100;
		int secondNumber = 20;
		
		AbstractOperation operation = new AddOperation();
		calculator.setOperation(operation);
		
		int answer = calculator.calculate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "+" + secondNumber + " = " + answer);
		
		operation = new SubstractOperation();
		calculator.setOperation(operation);
		
		answer = calculator.calculate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "-" + secondNumber + " = " + answer);
		
		operation = new MultiplyOperation();
		calculator.setOperation(operation);
		
		answer = calculator.calculate(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "*" + secondNumber + " = " + answer);
		
	}
}
