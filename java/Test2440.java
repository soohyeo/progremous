package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
public class Test2440 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하시오.");
		int n = Integer.parseInt(br.readLine());
			for(int i = n; i >= 1; i--) {
				System.out.print("\n");
				for(int j = 1; j <= i; j++) {
					System.out.print("*");
			}
		}
			return;
	}
}	


