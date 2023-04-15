package kr.co.ezenac.scannertest;

public class ScannerTest4 {

	public static void main(String[] args) {
		int n = 4321;
    	
    	String str = String.valueOf(n);
    	
    	int sum = 0;
    	
    	for(int i=0;i<str.length();i++) {
    		sum += str.charAt(i) - 48;
    	}
    	
    	System.out.println(sum);
	}

}
