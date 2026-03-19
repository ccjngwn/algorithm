import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Deque<Character> deq = new ArrayDeque<>();
        for (int i = 0; i < t; i++) {
            boolean flag = true;
            String str = br.readLine();
            
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == '(') deq.addLast(c);
                else if (c == ')') {
                    if (deq.isEmpty()) {
                        flag = false;
                        break;
                    }
                    
                    char last = deq.pollLast();
                    if (last != '(') {
                        flag = false;
                        break;
                    }
                }
            }

            if (!deq.isEmpty()) flag = false;
            
            if (flag) System.out.println("YES");
            else System.out.println("NO");
            deq.clear();
        }
    }
}