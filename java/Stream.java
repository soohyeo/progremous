package progremous;

import java.util.Arrays;

/*
 * 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
 *		       array		n	result
		[1, 1, 2, 3, 4, 5]	1	  2
 */


class Stream {
    public int solution(int[] array, int n) {        
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
    public static void main(String[] args) {
    		Stream sol = new Stream();
    	    int[] array = {1, 1, 2, 3, 4, 5};
    	    int n = 1;
    	    System.out.println(Arrays.toString(array));
    	    System.out.println(sol.solution(array, n));
    }
}
