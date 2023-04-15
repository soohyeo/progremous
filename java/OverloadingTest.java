package kr.co.ezenac.overloading;


class Calc{
	public int add(int a, int b) {					//void로 하면 리턴타입이 없음
		return a + b;
	}
	public int add(int a) {
		return a + 1;
	}
	public double add(double a, double b) {
		return a + b;
	}	
}
public class OverloadingTest {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int result1 = calc.add(3, 9);
		int result2 = calc.add(3);
		double result3 = calc.add(3.0, 9.0);
		
		System.out.println("result 1 = " + result1);
		System.out.println("result 2 = " + result2);
		System.out.println("result 3 = " + result3);
		
	}
}
