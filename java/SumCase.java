//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class SumCase {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int i = 0;
//        StringBuilder sb = new StringBuilder();
//        while(i<5) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), "");
//            int A = Integer.parseInt(st.nextToken());
//            int B = Integer.parseInt(st.nextToken());
//            i++;
//            System.out.println(A+B);
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumCase {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;

        while( (str=br.readLine()) != null ){

            int a = str.charAt(0) - 48;
            int b = str.charAt(2) - 48;
            sb.append(a+b).append("\n");

        }
        System.out.print(sb);
    }
}