import java.util.*;
import java.lang.*;
import java.io.*;

/**
(A + B) * ((A + B + 1) / 2)
(B - A + 1) % 2 == 1이면 (A + B) / 2 더해주기
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        if (B < A) {
            long tmp = A;
            A = B;
            B = tmp;
        }

        long sum = (A + B) * ((B - A + 1) / 2);
        if ((B - A + 1) % 2 == 1) {
            sum += (A + B) / 2;
        }

        System.out.println(sum);
    }
}