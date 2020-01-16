package chapter02.section05;

public class Calculator {
	
	private AbstractOperation operation;
	
	public int calculate(int firstNumber, int secondNumber) {	
		int answer = this.operation.operate(firstNumber, secondNumber);
		
		return answer;
	}
	
	public void setOperation(AbstractOperation operation) {
		this.operation = operation;
	}

}
