import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();

        long ans = 0;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            while (!deq.isEmpty() && deq.peekLast() <= k) deq.removeLast();
            ans += deq.size();
            deq.addLast(k);
        }

        System.out.println(ans);
    }
}