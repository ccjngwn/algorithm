import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            int k = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < k; j++) {
                pq.add(Long.parseLong(st.nextToken()));
            }

            long ans = 0;
            while (pq.size() > 1) {
                Long tmp = pq.remove() + pq.remove();
                ans += tmp;
                pq.add(tmp);
            }
            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}