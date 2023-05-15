//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Sumsum {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        String str;
//        while((str = br.readLine())!=null){
//            StringTokenizer st = new StringTokenizer(str, " ");
//            int A =Integer.parseInt(st.nextToken());
//            int B =Integer.parseInt(st.nextToken());
//            sb.append(A+B).append('\n');
//            System.out.println((A+B)+" ");
//        }
//    }
//}

import java.util.Scanner;

public class Sumsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }

        sc.close();
    }
}
