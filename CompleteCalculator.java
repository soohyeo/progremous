package kr.co.ezenac.interface1;

public class CompleteCalculator extends Calculator{

	@Override
	public int time(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		if(num2 == 0)
			return ERROR ;
		else
			return num1 / num2;
	}
		
}
