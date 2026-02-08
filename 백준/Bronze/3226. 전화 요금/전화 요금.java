import java.util.*;
import java.lang.*;
import java.io.*;

/**
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int price = 0;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] str = st.nextToken().split(":");

            int h = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int d = Integer.parseInt(st.nextToken());
            int end_h = h;
            int end_m = m;

            if (m + d < 60) {
                end_m = m + d;
            } else {
                int q = (m + d) / 60;
                end_m = (m + d) % 60;
                if (h + q < 24) {
                    end_h = h + q;
                } else {
                    end_h = (h + q) % 24;
                }
            }

            if (h == 6 && end_h == 7) {
                price += (d - end_m) * 5 + end_m * 10;
            } else if (h == 18 && end_h == 19) {
                price += (d - end_m) * 10 + end_m * 5;
            } else {
                if (6 < h && h < 19) {
                    price += 10 * d;
                } else {
                    price += 5 * d;
                }
            }
        }

        System.out.println(price);
    }
}