import java.util.Scanner;
import java.util.StringTokenizer;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = A * B;
        System.out.println(C);
    }
}
