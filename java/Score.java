import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Score {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());

        if(90 <= A && A<= 100){
            System.out.println("A");
        }
        else if(80 <= A && A<= 89){
            System.out.println("B");
        }
        else if(70 <= A && A<= 79){
            System.out.println("C");
        }
        else if(60 <= A && A<= 69){
            System.out.println("D");
        } else{
            System.out.println("F");
        }
    }
}
