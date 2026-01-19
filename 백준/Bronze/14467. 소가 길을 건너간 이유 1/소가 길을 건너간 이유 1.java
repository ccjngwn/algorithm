import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 2차원 배열 선언 - 1행에는 count, 2행에는 위치
2. 초기 위치는 -1
3. 입력을 받았을 때 x번 소의 2행의 값이 -1이라면 그대로 2행에 넣어주기
4. 입력을 받았을 때 x번 소의 2행의 값이 들어온 값과 다르다면 count++, 값 변경
5. count 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] cow = new int[2][11];

        for (int i = 1; i < 11; i++) {
            cow[1][i] = -1;
        }
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int position = Integer.parseInt(st.nextToken());

            if (cow[1][x] == -1) {
                cow[1][x] = position;
            } else if (cow[1][x] != position) {
                cow[0][x]++;
                cow[1][x] = position;
            }
        }

        int count = 0;
        for (int i = 1; i < 11; i++) {
            count += cow[0][i];
        }

        System.out.println(count);
    }
}