import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class RightTriangle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] nums = new int[3];
        int a;
        int b;
        int c;

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            nums[0] = Integer.parseInt(st.nextToken());
            if(nums[0] == 0)break;
            else{
                nums[1] = Integer.parseInt(st.nextToken());
                nums[2] = Integer.parseInt(st.nextToken());
                Arrays.sort(nums);
            }

            a = nums[0];
            b = nums[1];
            c = nums[2];

            if (a * a + b * b == c * c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }
}







