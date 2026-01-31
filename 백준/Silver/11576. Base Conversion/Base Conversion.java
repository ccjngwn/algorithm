import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int num = 0;
        while (st.hasMoreTokens()) {
            int k = Integer.parseInt(st.nextToken());

            num += k * Math.pow(a, m - 1);
            m--;
        }

        List<Integer> list = new ArrayList<>();
        while (num != 0) {
            list.add(num % b);
            num /= b;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            sb.append(list.get(i)).append(" ");
        }

        System.out.println(sb);
    }
}