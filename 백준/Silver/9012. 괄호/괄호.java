import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            Deque<Character> de = new ArrayDeque<>();
            String str = br.readLine();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    de.push(str.charAt(j));
                } else if (str.charAt(j) == ')') {
                    if (de.isEmpty()) {
                        flag = false;
                        break;
                    } else {
                        de.pop();
                    }
                }
            }

            if (flag == true && !de.isEmpty()) flag = false;

            if (flag == true) System.out.println("YES");
            else if (flag == false) System.out.println("NO");
        }
    }
}