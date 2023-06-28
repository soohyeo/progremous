import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Time {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (0 <= H && H <= 23) {
            if (M < 45) {
                H--;
                if (H < 0) {
                    H = 23;
                }
            }
        }

        M -= 45;
        if (M < 0) {
            M += 60;
        }

        System.out.println(H + " " + M);
    }
}



