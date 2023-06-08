import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SquareRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        List<Integer> resultList = new ArrayList<>();

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());
            BigInteger c = a.pow(b.intValue());

            int lastDigit = c.mod (BigInteger.TEN).intValue(); // 일의 자리 수 추출
            resultList.add(lastDigit); // 일의 자리 수를 리스트에 추가
        }

        for(int result : resultList){
            System.out.println(result);
        }

    }
}
