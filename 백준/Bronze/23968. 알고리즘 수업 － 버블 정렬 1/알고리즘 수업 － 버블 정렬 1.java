import java.util.*;
import java.lang.*;
import java.io.*;

/*

*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] bubble = new int[N];
        for (int i = 0; i < N; i++) {
            bubble[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for (int i = N; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (bubble[j] > bubble[j+1]) {
                    int tmp = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = tmp;
                    count++;
                    if (count == K) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(bubble[j]).append(" ").append(bubble[j+1]);
                        System.out.print(sb);
                        return;
                    }
                }
            }
        }
        System.out.println(-1);
    }
}
