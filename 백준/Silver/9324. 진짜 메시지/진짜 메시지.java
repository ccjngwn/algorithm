import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. N번 반복하면서 문자열 검증
2. 문자열에서 같은 문자가 3번 나오면 그 문자가 한 번 더 삽입되어야함
3. count 배열을 만들어서 문자열 반복 돌면서 1씩 증가시키기
4. count가 3인데 다음에 그 문자가 안나오면 FAKE 출력
5. 문자열 반복문을 통과했다면 OK 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int j = 0; j < N; j++) {
            int[] count = new int[26];
            String str = br.readLine();
            boolean flag = false;
            char c = 0;
            for (int i = 0; i < str.length(); i++) {
                int idx = (int)str.charAt(i) - 'A';

                if (flag) {
                    if (str.charAt(i) == c) {
                        flag = false;
                        count[idx] = 0;
                    } else {
                        break;
                    }
                } else {
                    count[idx]++;
                }
                
                if (count[idx] == 3) {
                    flag = true;
                    c = str.charAt(i);
                }
            }
            if (!flag) System.out.println("OK");
            else System.out.println("FAKE");
        }
    }
}