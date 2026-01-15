import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int tall = stack.pop();
        int count = 1;
        for (int i = 0; i < N - 1; i++) {
            int a = stack.pop();
            if (a > tall) {
                count++;
                tall = a;
            }
        }

        System.out.println(count);
    }
}