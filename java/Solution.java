package Baekjoon;

public class Solution {
    public String solution(int num) {
        String answer= "";
        
        if(num%2==1){
            answer="Odd";
        }else
            answer="Even";
        
        return answer;
}
    
	public static void main(String[] args){
	       Solution eoo = new Solution();
	        System.out.println("결과 : "+ eoo.solution(3));
	        System.out.println("결과 : "+ eoo.solution(4));
	    }
	}



