import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 새의 수 N 입력받기
2. 새의 수가 i보다 작다면 i = 1
3. i = 1부터 반복문 돌면서 새의 수에서 i만큼 -하기 + sec 1만큼 증가시키기
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int i = 1; // 불러야하는 수
        int sec = 0;

        while (N > 0) {
            if (i > N) i = 1;
            N = N - i;
            i++;
            sec++;
        }

        System.out.println(sec);
    }
}