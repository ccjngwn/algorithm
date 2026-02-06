import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        boolean flag = true;
        for (int i = N; i > 0; i--) {
            String str = i + "";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != '4' && str.charAt(j) != '7') {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }

            if (flag) {
                System.out.println(str);
                    break;
            }
        }
    }
}