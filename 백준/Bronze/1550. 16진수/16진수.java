import java.util.*;
import java.lang.*;
import java.io.*;

/*
1. 입력받아서 문자열로 저장
2. A~F면 숫자로 변환
3. 16^size-1-index만큼해서 더하기
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        long[] num1 = new long[num.length()];
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            switch (c) {
                case 'A':
                    num1[i] = 10;
                    break;
                case 'B':
                    num1[i] = 11;
                    break;
                case 'C':
                    num1[i] = 12;
                    break;
                case 'D':
                    num1[i] = 13;
                    break;
                case 'E':
                    num1[i] = 14;
                    break;
                case 'F':
                    num1[i] = 15;
                    break;
                default:
                    num1[i] = c - 48;
            }
        }

        for (int i = 0; i < num1.length; i++) {
            sum += (long)(num1[i] * Math.pow(16, num1.length - 1 - i));
        }

        System.out.println(sum);
    }
}
