import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] tmp = str.toCharArray();
        StringBuilder result = new StringBuilder(); // 사용할 문자열을 StringBuilder로 선언

        for (char x : tmp) {
            if (Character.isLowerCase(x)) {
                result.append(Character.toUpperCase(x)); // 대문자로 변환한 문자를 result에 추가
            } else {
                result.append(Character.toLowerCase(x)); // 소문자로 변환한 문자를 result에 추가
            }
        }

        System.out.println(result.toString()); // StringBuilder를 문자열로 변환하여 출력
    }
}