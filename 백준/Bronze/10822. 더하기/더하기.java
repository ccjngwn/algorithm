import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(",");

        long sum = 0;
        for (String str : arr) {
            sum += Long.parseLong(str);
        }

        System.out.println(sum);
    }
}