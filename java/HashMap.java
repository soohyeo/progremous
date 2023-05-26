import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<String, Integer> A = new HashMap<>();

        for (int i = 0 ; i < N ; i++) {
            A.put(st.nextToken(), 0);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < M ; i++) {
            if (A.containsKey(st.nextToken()))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}