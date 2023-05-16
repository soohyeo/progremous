import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int [] A = new int[N];
        int count = 0;
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            }
        int v = Integer.parseInt(br.readLine());
        for (int a : A) {
            if (a == v)
                count++;
        }
        System.out.println(count);
    }
}
