import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deq.addLast(Integer.parseInt(br.readLine()));
        }

        Deque<Integer> nums = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            nums.addLast(i);
            sb.append("+").append("\n");
            
            while (!deq.isEmpty() && !nums.isEmpty() && (int)deq.peekFirst() == (int)nums.peekLast()) {
                sb.append("-").append("\n");
                deq.removeFirst();
                nums.removeLast();
            }
        }

        if (nums.isEmpty()) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}