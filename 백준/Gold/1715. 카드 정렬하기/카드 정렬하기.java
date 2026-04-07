import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        int ans = 0;
        while (pq.size() != 1) {
            int a = pq.remove();
            int b = pq.remove();
            ans += a + b;
            pq.add(a + b);
        }

        System.out.println(ans);
    }
}