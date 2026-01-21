import java.util.*;
import java.lang.*;
import java.io.*;

/**
파일개수: N
N번 반복돌면서 정수형 배열에 파일 크기 저장
마지막 줄에 클러스터 크기 - cluster로 저장
N번 반복 돌면서 
    1. 파일 크기 % 클러스터 == 0
        파일 크기 / 클러스터를 count에 저장
    2. 그렇지 않으면
        파일 크기 / 클러스터 + 1을 count에 저장
count * 클러스터 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] file = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            file[i] = Long.parseLong(st.nextToken());
        }

        long cluster = Long.parseLong(br.readLine());
        long count = 0;
        
        for (int i = 0; i < N; i++) {
            if (file[i] % cluster == 0)
                count += file[i] / cluster;
            else
                count += file[i] / cluster + 1;
        }

        System.out.println(count * cluster);
    }
}