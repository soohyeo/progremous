package progremous;

public class Percent {

	int solution(int num1, int num2) {
	
	    int answer = -1;
	    if((num1>0&&num1<=100)&&(num2>0&&num2<=100))
	        answer = num1%num2;

	    return answer;
	}
	
	public static void main(String[] args) {
		Percent asd = new Percent();
		
		int num1 = 5;
		int num2 = 3;
			 
				
		int num3 = asd.solution(num1, num2);
		System.out.println(num3);
		
		
	}
}
