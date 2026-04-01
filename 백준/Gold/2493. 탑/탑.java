import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Deque<int[]> stack = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            stack.addLast(new int[]{Integer.parseInt(st.nextToken()), i});
        }

        Deque<int[]> store = new ArrayDeque<>();
        int[] arr = new int[n];

        while (!stack.isEmpty()) {
            int[] k = stack.removeLast();
            while (!store.isEmpty()) {
                int[] c = store.peekLast();
                if (k[0] >= c[0]) {
                    store.removeLast();
                    arr[c[1]] = k[1] + 1;
                } else {
                    break;
                }
            }
            store.addLast(k);
        }

        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
    }
}