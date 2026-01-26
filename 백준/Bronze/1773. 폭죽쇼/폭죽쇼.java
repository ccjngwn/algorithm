import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cycle = new int[N];
        for (int i = 0; i < N; i++) {
            cycle[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = 1; i <= C; i++) {
            for (int j = 0; j < N; j++) {
                if (i % cycle[j] == 0) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}