package chapter02.section05;

public class SubstractOperation extends AbstractOperation {

	@Override
	public int operate(int firstNumber, int secondNumber) {
		int answer = firstNumber - secondNumber;
				
		return answer;
	}

}
