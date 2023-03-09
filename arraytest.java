package progremous;

import java.util.Arrays;

class Solution{
	public int[] solution(int[]arr) {
		int[] answer = {};
		int x = arr[0];			//0번째 방안에 있는 값을 x에 대입
		
		if(arr.length == 1)
			return answer = new int[] {-1};
		
		for(int i=0; i<arr.length; i++) {
			if(x>arr[i])
				x = arr[i];		//기준점보다 작은애가 나타나면 작은애로 바꿀거다
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == x) {					// 없앨애가 작은애라서 arr[i] 찾는다.i x값이 들어있는 방의 번호를 찾는거다
				for(int j = i; j<arr.length-1; j++) {//작은애를 찾으면은 오르쪽에서 부터 하나씩 다 땡겨온다.
					arr[j]= arr[j+1];				//length-1 이거는arr[j+1]의 마지막 방이 되게하여주기 위해 맞춰준거다.
				}
			}
		}
		answer = Arrays.copyOf(arr, arr.length-1);// 방이 하나가 줄어든거고
		
		return answer;
	}
}
public class arraytest {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = new int[] {4,3,2,1};
		
		arr = sol.solution(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	

	}
}
