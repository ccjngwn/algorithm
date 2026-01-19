import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. T 입력받고 T번 반복하기
2. 이중 반복문으로 N부터 M까지 증가했을 때 charAt으로 0이 몇 번인지 count++하기
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int count = 0;
            for (int j = N; j <= M; j++) {
                String str = j + "";
                for (int k = 0; k < str.length(); k++) {
                    if (str.charAt(k) == '0') count++;
                }
            }
            System.out.println(count);
        }
    }
}