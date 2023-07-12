import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Byte {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if((N%4 == 0) && (4<=N) &&(N<=1000)){
            for(int i=1; i<=N/4; i++){
                System.out.print("long ");
            }
            System.out.print("int");
        }
    }
}
