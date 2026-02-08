import java.util.*;
import java.lang.*;
import java.io.*;

/**
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int sum = e + f;
        int ans = 0;

        while (sum >= c) {
            int mock = sum / c;
            ans += mock;

            sum = mock + (sum%c);
        }

        System.out.println(ans);
    }
}