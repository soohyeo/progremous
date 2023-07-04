import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C){
            System.out.print(10000 + (A*1000));
        }
        else if(A == B || B == C || A == C){
            if(A == B){
                System.out.print(1000 + (A*100));
            }
            if(B == C){
                System.out.print(1000 + (B*100));
            }
            if(A == C){
                System.out.print(1000 + (A*100));
            }
        }
        else if(A != B && B != C && A != C){
            if(A > B && A > C){
                System.out.print(A * 100);
            }
            if(B > A && B > C){
                System.out.print(B * 100);
            }
            if(C > B && C > A){
                System.out.print(C * 100);
            }
        }
    }
}
