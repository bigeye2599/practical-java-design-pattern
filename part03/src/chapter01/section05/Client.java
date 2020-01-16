package chapter01.section05;

public class Client {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		calculator.setAddOperation(new AddOperation());
		calculator.setSubstractOperation(new SubstractOperation());
		calculator.setMultiplyOperation(new MultiplyOperation());
		calculator.setDivideOperation(new DivideOperation());
		
		int firstNumber = 100;
		int secondNumber = 20;
		
		String operator = "+";
		int answer = calculator.calculate(operator, firstNumber, secondNumber);
		
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
		
		operator = "-";
		answer = calculator.calculate(operator, firstNumber, secondNumber);
		
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
		
		operator = "*";
		answer = calculator.calculate(operator, firstNumber, secondNumber);
		
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
		
		operator = "/";
		answer = calculator.calculate(operator, firstNumber, secondNumber);
		
		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
	}
}
