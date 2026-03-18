import java.util.*;
import java.lang.*;
import java.io.*;

/*
입력받아서 2차원 배열 만들기
2차원 배열의 누적합 계산하기 - prefix_sum[x, y] = 입력값 + prefix_sum[x - 1, y] + prefix_sum[x, y - 1] - prefix_sum[x - 1, y - 1]
m번 반복 돌면서 구간합 계산하기 - prefix_sum[x2, y2] - prefix_sum[x1 - 1, y2] - prefix_sum[x2, y1 - 1] + prefix_sum[x1 - 1, y1 - 1]
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] prefix_sum = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < n + 1; j++) {
                prefix_sum[i][j] = Integer.parseInt(st.nextToken()) + prefix_sum[i - 1][j] + prefix_sum[i][j - 1] - prefix_sum[i - 1][j - 1];
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int sum = prefix_sum[x2][y2] - prefix_sum[x1 - 1][y2] - prefix_sum[x2][y1 - 1] + prefix_sum[x1 - 1][y1 - 1];
            System.out.println(sum);
        }
    }
}