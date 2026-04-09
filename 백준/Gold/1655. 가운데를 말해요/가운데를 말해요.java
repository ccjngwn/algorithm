import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (max.size() <= min.size()) {
                max.add(Integer.parseInt(br.readLine()));
            } else {
                min.add(Integer.parseInt(br.readLine()));
            }

            if (!min.isEmpty() && min.peek() < max.peek()) {
                int minNum = min.remove();
                int maxNum = max.remove();
                min.add(maxNum);
                max.add(minNum);
            }

            sb.append(max.peek()).append("\n");
        }

        System.out.print(sb);
    }
}