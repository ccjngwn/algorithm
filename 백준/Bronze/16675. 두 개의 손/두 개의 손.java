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

        int ml = Arrays.asList(rsp).indexOf(st.nextToken());
        int mr = Arrays.asList(rsp).indexOf(st.nextToken());
        int tl = Arrays.asList(rsp).indexOf(st.nextToken());
        int tr = Arrays.asList(rsp).indexOf(st.nextToken());

        if (tl == tr) {
            if ((ml + 1) % 3 == tl || (mr + 1) % 3 == tl) {
                System.out.println("MS");
                return;
            }
        }

        if (ml == mr) {
            if ((tl + 1) % 3 == ml || (tr + 1) % 3 == ml) {
                System.out.println("TK");
                return;
            }
        }

        System.out.println("?");
    }
}