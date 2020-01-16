package chapter02.section04;

public class Client {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		int firstNumber = 100;
		int secondNumber = 20;
		
		AddOperation addOperation = new AddOperation();
		calculator.setAddOperation(addOperation);
		
		int answer = calculator.add(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "+" + secondNumber + " = " + answer);
		
		SubstractOperation substractOperation = new SubstractOperation();
		calculator.setSubstractOperation(substractOperation);
		
		answer = calculator.substract(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "-" + secondNumber + " = " + answer);
		
		MultiplyOperation multiplyOperation = new MultiplyOperation();
		calculator.setMultiplyOperation(multiplyOperation);
	
		answer = calculator.multiply(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "*" + secondNumber + " = " + answer);
		
		DivideOperation divideOperation = new DivideOperation();
		calculator.setDivideOperation(divideOperation);
	
		answer = calculator.divide(firstNumber, secondNumber);
		
		System.out.println(firstNumber + "/" + secondNumber + " = " + answer);
		
	}
}
