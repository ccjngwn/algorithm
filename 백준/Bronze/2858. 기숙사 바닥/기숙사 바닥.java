import java.util.*;
import java.lang.*;
import java.io.*;

/**
R = 2L + 2W - 4
B = LW - 8
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for (int i = 3; i < R; i++) {
            for (int j = 3; j < R; j++) {
                if (2 * i + 2 * j - 4 == R && i * j - R == B) {
                    StringBuilder sb = new StringBuilder();
                    if (i > j) sb.append(i).append(" ").append(j);
                    else sb.append(j).append(" ").append(i);
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}