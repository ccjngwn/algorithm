import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> o1[0] - o2[0]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int deadline = arr[i][0];
            int ramen = arr[i][1];
            pq.add(ramen);
            if (pq.size() > deadline) {
                pq.remove();
            }
        }

        long ans = 0;
        while (!pq.isEmpty()) {
            ans += pq.remove();
        }

        System.out.println(ans);
    }
}