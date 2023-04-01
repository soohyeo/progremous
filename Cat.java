package kr.co.ezenac.global;

public class Cat {

	int num = 3;
	static int a = 5;
	
	public void printValue(int num) {
		this.num = num;
		System.out.println("num : " + this.num);
		System.out.println("a: " + a);
	}
	
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 +", "+ num2);
		
		Cat cat1 = new Cat();		// cat1 : 스택 영역에 생성
		cat1.num = 1;
		cat1.a = 10;				// static 변수에 직접 접근 
		Cat.a = 10;
		cat1.printValue(20);   		// 메서드 호출 
		System.out.println(cat1.num);
		
		System.out.println();
			
		Cat cat2 = new Cat();		// cat2 : 스택 영역에 생성
		cat2.num = 2;
		cat2.a = 11;				// static 변수에 직접 접근
		cat2.printValue(10);
		System.out.println(cat2.num);
		
		System.out.println();
		System.out.println(cat2.a);
		System.out.println(cat1.a);
	}
}
















