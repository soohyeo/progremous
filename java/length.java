import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class length {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        System.out.println(A.length());
    }
}
