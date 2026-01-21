import java.util.*;
import java.lang.*;
import java.io.*;

/**
N 입력받기
현재 시간은 sec, 0으로 초기화
배열로 1행에는 도착 시간, 2행에는 검문 시간
배열의 1행을 기준으로 오름차순 정렬
배열을 처음부터 반복문 돌면서 key가 sec보다 크다면 sec = key, sec + test
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] cow = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            cow[i][0] = Integer.parseInt(st.nextToken());
            cow[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cow, (o1, o2) -> {
            if (o1[0] != o2[0])
                return o1[0] - o2[0];
            else return o1[1] - o2[1];
        });

        int sec = 0;
        for (int i = 0; i < N; i++) {
            int arrive = cow[i][0];
            int test = cow[i][1];
            if (arrive > sec) sec = arrive;
            sec += test;
        }

        System.out.println(sec);
    }
}