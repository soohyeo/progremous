package progremous;
/*
 * 0 < num1 ≤ 100
 * 0 < num2 ≤ 100
 * 75-41
 * 제한속에서의 뺄셈
 */
public class Minus {
	public static void main(String[] args) {
	int num1 = 75;
	int num2 = 41;
	int answer = 0;
    if ((num1>0 && num1<=100)&&(num2>0 && num2<=100)){
        answer = num1-num2;
        System.out.println(answer);
        
    	}
	}
}

