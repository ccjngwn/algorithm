import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {

    static int N;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int[] dp = new int[11];
        dp[2] = 1;

        for (int i = 3; i <= N; i++) {
            dp[i] = (i-1) + dp[i-1];
        }

        System.out.println(dp[N]);
    }
}