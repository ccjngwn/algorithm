import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deq = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) deq.pop();
            else deq.push(a);
        }

        int sum = 0;
        for (int a : deq) {
            sum += a;
        }

        System.out.println(sum);
    }
}