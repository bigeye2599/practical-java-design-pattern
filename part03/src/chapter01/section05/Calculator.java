package chapter01.section05;

public class Calculator {

	private AddOperation addOpertaion;
	private SubstractOperation substractOperation;
	private MultiplyOperation multiplyOperation;
	private DivideOperation divideOperation;
	
	public int calculate(String operator, int firstNumber, int secondNumber) {
		
		int answer = 0;
		
		if ("+".equals(operator)) {
			answer = this.addOpertaion.operate(firstNumber, secondNumber);
		} else if ("-".equals(operator)) {
			answer = this.substractOperation.operate(firstNumber, secondNumber);
		} else if ("*".equals(operator)) {
			answer = this.multiplyOperation.operate(firstNumber, secondNumber);
		} else if ("/".equals(operator)) {
			answer = this.divideOperation.operate(firstNumber, secondNumber);
		}
		
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
