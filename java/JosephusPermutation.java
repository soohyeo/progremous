import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class JosephusPermutation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Queue<Integer> people = new LinkedList<>();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i = 1 ; i <= N ; i++) {
            people.add(i);
        }

        System.out.print("<");
        while (people.size() > 0) {
            if (people.size() == 1)
                System.out.print(people.poll());
            else {
                for (int i = 1; i < K; i++) {
                    people.offer(people.poll());
                }
                System.out.print(people.poll() + ", ");
            }
        }
        System.out.print(">");
    }
}