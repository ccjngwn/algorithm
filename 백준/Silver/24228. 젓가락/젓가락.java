import java.util.*;
import java.lang.*;
import java.io.*;

/**
N = 2, N = 3 기준으로 테스트해보았을 때 관계식: N + 2R - 1이 나옴
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

        System.out.println(N + 2 * R - 1);
    }
}