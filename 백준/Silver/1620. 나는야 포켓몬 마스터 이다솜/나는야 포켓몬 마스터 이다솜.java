import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, String> name = new HashMap<>();
        HashMap<String, String> num = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String in = br.readLine();
            name.put(in, i + "");
            num.put(i + "", in);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String in = br.readLine();
            String answer = name.containsKey(in) ? name.get(in) : num.get(in);
            sb.append(answer).append("\n");
        }

        System.out.print(sb);
    }
}