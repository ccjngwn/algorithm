import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;
            Deque<Character> de = new ArrayDeque<>();    
            boolean flag = true;
            
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                
                if (c == '(') de.push(c);
                else if (c == ')') {
                    if (!de.isEmpty() && de.peek() == '(') de.pop();
                    else {
                        System.out.println("no");
                        flag = false;
                        break;
                    }
                } else if (c == '[') de.push(c);
                else if (c == ']') {
                    if (!de.isEmpty() && de.peek() == '[') de.pop();
                    else {
                        System.out.println("no");
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) continue;
            System.out.println(de.isEmpty() ? "yes" : "no");
        }
    }
}