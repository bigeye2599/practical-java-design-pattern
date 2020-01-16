package chapter01.section04;

public class Calculator {

	public int calculate(String operator, int firstNumber, int secondNumber) {
		
		int answer = 0;
		
		if ("+".equals(operator)) {
			answer = firstNumber + secondNumber;
		} else if ("-".equals(operator)) {
			answer = firstNumber - secondNumber;
		} else if ("*".equals(operator)) {
			answer = firstNumber * secondNumber;
		} else if ("/".equals(operator)) {
			answer = firstNumber / secondNumber;
		}
		
		return answer;
	}
	
}
