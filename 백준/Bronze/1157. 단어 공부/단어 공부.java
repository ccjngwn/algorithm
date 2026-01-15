import java.util.*;
import java.lang.*;
import java.io.*;

/*
문자를 대문자로 변환
초기값이 0인 배열을 만들어서 count하기
가장 큰 값이 1개면 그거 대문자로 출력
가장 큰 값이 여러 개면 ? 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String str1 = str.toUpperCase();

        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            count[c - 'A']++;
        }

        int max = 0;
        int idx = 0;
        boolean duplicated = false;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                idx = i;
                duplicated = false;
            } else if (count[i] == max) {
                duplicated = true;
            }
        }

        System.out.println(duplicated ? "?" : (char)(idx + 'A'));
    }
}