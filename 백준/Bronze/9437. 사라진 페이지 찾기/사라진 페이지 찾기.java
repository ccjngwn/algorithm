import java.util.*;
import java.lang.*;
import java.io.*;

/**
들어온 게 0일 때까지 입력 받기
N, P 입력 받기
P가 홀수 -> P+1 리스트에 담기
P가 짝수 -> P-1 리스트에 담기
N + 1 - P = k
k가 홀수 -> k, k+1 리스트에 담기
k가 짝수 -> k, k-1 리스트에 담기
리스트 정렬 후 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (true) {
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) break;
            int P = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();
            if (P % 2 == 0) 
                list.add(P - 1);
            else
                list.add(P + 1);

            int k = N + 1 - P;

            list.add(k);
            if (k % 2 == 0) 
                list.add(k - 1);
            else
                list.add(k + 1);

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for (int a : list) {
                sb.append(a).append(" ");
            }
            System.out.println(sb);
            st = new StringTokenizer(br.readLine());
        }
    }
}