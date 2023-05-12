import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=N;1<=N;i++){
            for(int j=1; j<=9;j++){
                System.out.println(i+" * "+j+" = "+(i*j));

            }break;
        }
    }
}
