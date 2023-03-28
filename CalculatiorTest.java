package kr.co.ezenac.interface1;

public class CalculatiorTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalculator();
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + "+"+ num2 + "="+ calc.add(num1, num2));
		System.out.println(num1 + "-"+ num2 + "="+ calc.substract(num1, num2));
		System.out.println(num1 + "="+ num2 + "="+ calc.time(num1, num2));
		System.out.println(num1 + "/"+ num2 + "="+ calc.divide(num1, num2));
	}
}
