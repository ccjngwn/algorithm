import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String H = br.readLine();
        String N = br.readLine();

        StringBuilder sb = new StringBuilder();
        int index = H.length() - N.length();

        int answer = 0;

        for (int i = 0; i <= index; i++) {
            String count = H.substring(i, (i + N.length()));

            if ((i + N.length()) > H.length()) {
                break;
            } else {
                if (count.equals(N)) {
                    answer++;
                } else {
                    continue;
                }
            }
        }

        sb.append(answer);
        System.out.println(sb.toString());
    }
}