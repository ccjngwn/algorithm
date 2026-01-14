import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Integer.parseInt(br.readLine());
        long now = 2;
        long prev = 1;

        for (int i = 0; i < N - 2; i++) {
            long tmp = now;
            now = (now + prev) % 15746;
            prev = tmp;
        }
        if (N == 1) System.out.println(prev);
        else if (N == 2) System.out.println(now);
        else System.out.println(now);
    }
}