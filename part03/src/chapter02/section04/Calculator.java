package chapter02.section04;

public class Calculator {

	private AddOperation addOpertaion;
	private SubstractOperation substractOperation;
	private MultiplyOperation multiplyOperation;
	private DivideOperation divideOperation;
	
	public int add(int firstNumber, int secondNumber) {
		int answer = addOpertaion.operate(firstNumber, secondNumber);
		
		return answer;
	}
	
	public int substract(int firstNumber, int secondNumber) {
		int answer = substractOperation.operate(firstNumber, secondNumber);
		
		return answer;
	}
	
	public int multiply(int firstNumber, int secondNumber) {
		int answer = multiplyOperation.operate(firstNumber, secondNumber);
		
		return answer;
	}
	
	public int divide(int firstNumber, int secondNumber) {
		int answer = divideOperation.operate(firstNumber, secondNumber);
		
		return answer;
	}
	
	public void setAddOperation(AddOperation operation) {
		this.addOpertaion = operation;
	}
	
	public void setSubstractOperation(SubstractOperation substractOperation) {
		this.substractOperation = substractOperation;
	}
	
	public void setMultiplyOperation(MultiplyOperation multiplyOperation) {
		this.multiplyOperation = multiplyOperation;
	}
	
	public void setDivideOperation(DivideOperation divideOperation) {
		this.divideOperation = divideOperation;
	}
	
}
