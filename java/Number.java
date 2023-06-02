import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int sum = 0;
        while(st.hasMoreTokens()) {
            int T = Integer.parseInt(st.nextToken());
            int result = (int)Math.pow(T,2);
            sum += result;
        }
        int D = sum % 10;
        System.out.println(D);

    }
}
