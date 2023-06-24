import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Multiful {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = B%10;
        int D = B%100;
        System.out.println(A*(B%10));
        System.out.println((A*((B%100)-(C)))/10);
        System.out.println((A*((B%1000)-(D)))/100);
        System.out.println(A*B);
    }
}
