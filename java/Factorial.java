import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result=1;
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            result *= i;
        }
        System.out.println(result);
    }
}
