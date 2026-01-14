import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long zero = 0;
        long one = 1;

        for (int i = 2; i <= N; i++) {
            long tmp = zero;
            zero = zero + one;
            one = tmp;
        }

        if (N==1) {
            System.out.println(1);
        } else System.out.println(zero + one);
    }
}