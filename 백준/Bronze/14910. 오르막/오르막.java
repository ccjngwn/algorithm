import java.util.*;
import java.lang.*;
import java.io.*;

/**
*/
public class Main {
    static String[] rsp = {"R", "S", "P"};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int prev = -1000000;
        while(st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (prev <= a) prev = a;
            else {
                System.out.println("Bad");
                return;
            }
        }

        System.out.println("Good");
    }
}