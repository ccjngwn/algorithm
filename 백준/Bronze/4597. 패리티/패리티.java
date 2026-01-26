import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while(!(str = br.readLine()).equals("#")) {
            int count1 = str.length() - str.replace("1", "").length();

            char last = str.charAt(str.length() - 1);
            String ans = "";
            if (last == 'e') {
                if (count1 % 2 == 0) ans = str.replace("e", "0");
                else ans = str.replace("e", "1");
            } else if (last == 'o') {
                if (count1 % 2 == 0) ans = str.replace("o", "1");
                else ans = str.replace("o", "0");
            }

            System.out.println(ans);
        }
    }
}