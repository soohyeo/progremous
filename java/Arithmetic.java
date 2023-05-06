import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A+B;
        int D = A-B;
        int E = A*B;
        int F = A/B;
        int G = A%B;
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
        System.out.println(G);

    }
}
