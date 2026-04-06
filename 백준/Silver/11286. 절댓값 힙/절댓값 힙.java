import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
            int o1Abs = Math.abs(o1);
            int o2Abs = Math.abs(o2);
            if (o1Abs == o2Abs) return o1 > o2 ? 1 : -1;
            else return o1Abs - o2Abs;
        });

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            if (k == 0) {
                if (pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.remove());
            } else {
                pq.add(k);
            }
        }
    }
}