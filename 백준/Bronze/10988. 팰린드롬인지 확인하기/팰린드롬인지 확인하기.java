import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 실패 조건: 오른쪽 != 왼쪽
        // 반복문 조건: (int) length/2
        // if문 조건: length - 1 - i를 해서 i랑 비교해서 같으면?

        String str = br.readLine();
        int mid = (int)(str.length() / 2);
        boolean flag = true;
        for (int i = 0; i < mid; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.println(0);
                flag = false;
                break;
            }
        }
        
        if (flag == true) System.out.println(1);
    }
}