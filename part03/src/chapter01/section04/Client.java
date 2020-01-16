package chapter01.section04;

public class Client {

	public static void main(String[] args) {

		Calculator calcurator = new Calculator();

		int firstNumber = 100;
		int secondNumber = 20;

		String operator = "+";
		int answer = calcurator.calculate(operator, firstNumber, secondNumber);

		System.out.println(firstNumber + operator + secondNumber + " = " + answer);

		operator = "-";
		answer = calcurator.calculate(operator, firstNumber, secondNumber);

		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
		
		operator = "*";
		answer = calcurator.calculate(operator, firstNumber, secondNumber);

		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
		
		operator = "/";
		answer = calcurator.calculate(operator, firstNumber, secondNumber);

		System.out.println(firstNumber + operator + secondNumber + " = " + answer);
	}
	
}
