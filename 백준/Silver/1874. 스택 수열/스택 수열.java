import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] target = new int[n];
        Deque<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            target[i] = Integer.parseInt(br.readLine());
        }

        int currentNum = 1;
        for (int i = 0; i < n; i++) {
            int targetNum = target[i];

            while (currentNum <= targetNum) {
                nums.addLast(currentNum++);
                sb.append("+").append("\n");
            }

            if (!nums.isEmpty() && (int)nums.peekLast() == targetNum) {
                nums.removeLast();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb);
    }
}