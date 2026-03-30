import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String op = st.nextToken();
            switch (op) {
                case "push":
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.removeFirst()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    if (deq.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case "front":
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.peekFirst()).append("\n");
                    }
                    break;
                case "back":
                    if (deq.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(deq.peekLast()).append("\n");
                    }
                    break;
                default:
            }
        }

        System.out.print(sb);
    }
}