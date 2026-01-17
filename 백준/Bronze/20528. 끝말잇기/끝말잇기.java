import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. String[]에 입력받기
2. String[]을 돌면서 i와 i+1을 비교해서 i의 마지막과 i+1의 첫글자가 다르면 0 출력
3. 같으면 반복문 끝났을 때 1 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = st.nextToken();
        }

        for (int i = 0; i < N - 1; i++) {
            int last = arr[i].length() - 1;
            int first = arr[i+1].length() - 1;
            if (arr[i].charAt(last) != arr[i+1].charAt(first)) {
                System.out.println(0);
                return ;
            }
        }

        System.out.println(1);
    }
}