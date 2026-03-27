import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            HashMap<String, Integer> hm = new HashMap<>();
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String type = st.nextToken();
                if (hm.containsKey(type)) {
                    hm.put(type, hm.get(type) + 1);
                } else {
                    hm.put(type, 1);
                }
            }

            long result = 1;
            for (int count : hm.values()) {
                result *= (count + 1);
            }

            result -= 1;
            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}