import java.util.*;
import java.lang.*;
import java.io.*;

/**
N, M 입력받기
N번 반복 돌면서 문자열 배열로 저장
N번 반복문 돌면서 str1[i]와 새로 입력받은 문자열 비교
idx = 0으로 세팅
    이 안에서 M번 반복문 돌면서 charAt(i), charAt(i+1) 비교해서 다르면 바로 출력하고 리턴
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] str1 = new String[N];
        for (int i = 0; i < N; i++) {
            str1[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            String str = str1[i];
            String comp = br.readLine();

            int idx = 0;
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) != comp.charAt(idx) || str.charAt(j) != comp.charAt(idx + 1)) {
                    System.out.println("Not Eyfa");
                    return;
                }
                idx += 2;
            }
        }

        System.out.println("Eyfa");
    }
}