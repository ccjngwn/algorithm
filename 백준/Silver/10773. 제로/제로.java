import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        Deque<Integer> deq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            int in = Integer.parseInt(br.readLine());
            if (in != 0) {
                deq.addFirst(in);
            } else {
                if (!deq.isEmpty()) {
                    deq.removeFirst();
                }
            }
        }

        int answer = 0;
        Iterator<Integer> iter = deq.iterator();
        while (iter.hasNext()) {
            answer += iter.next();
        }

        System.out.println(answer);
    }
}