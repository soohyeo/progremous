import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] A = new int[31];
        int student;
        for(int i=1; i<=28; i++){
            student = Integer.parseInt(br.readLine());
            A[student]++;
        }

        for (int i = 1 ; i <= 30 ; i++) {
            if (A[i] == 0)
                System.out.println(i);
        }
    }
}
