import java.util.*;
import java.lang.*;
import java.io.*;

/*
N 입력 받기
start, end를 그 자체로 숫자로 써서 더하고 빼기
start, end = 1, 2부터 시작해서 sum < N -> end++
                         sum > N -> start++
                         sum = N -> ans++, start++, end++
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = 1;
        int end = 2;
        int sum = start + end;
        int ans = 1;

        while (start <= N / 2) {
            if (sum < N) {
                end++;
                sum += end;
            } else if (sum > N) {
                sum -= start;
                start++;
            } else {
                ans++;
                sum -= start;
                start++;
                end++;
                sum += end;
            }
        }

        System.out.println(ans);
    }
}