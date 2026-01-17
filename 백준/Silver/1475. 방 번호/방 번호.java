import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 입력
2. 뒷자리부터 /10, %10해서 꺼내기
3. int[]으로 각 자리 숫자 개수 count
4. 가장 큰 값 꺼내오기 - 6,9는 같이 처리 - count[6]은 /2 필요
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        if (num == 0) {
            System.out.println(1);
            return;
        }
        
        int[] count = new int[9];

        for (int i = num; i > 0; i /= 10) {
            int n = i % 10;
            if (n == 9) count[6]++;
            else count[n]++;
        }

        count[6] = (count[6] + 1) / 2;
        int max = 0;
        for (int j = 0; j < count.length; j++) {
            if (count[j] > max) max = count[j];
        }

        System.out.println(max);
    }
}