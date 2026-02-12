import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] words = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            
            for (String s : words) {
                StringBuilder tmp = new StringBuilder(s);
                sb.append(tmp.reverse()).append(" ");
            }

            System.out.println(sb);
        }
    }
}