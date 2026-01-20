import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 전구 입력 받기
2. 반복은 str에 Y가 있는 동안 계속
3. str의 첫 번째부터 반복 돌면서 Y 위치 찾아서 i에 저장
4. i가 0보다 크거나 같다면 i의 배수만큼 상태 반전하고 count++
5. 반복문 끝나면 count 출력
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int i = -1;
        int count = 0;
        
        while (str.contains("Y")) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == 'Y') {
                    i = j;
                } else {
                    i = -1;
                }

                if (i >= 0) {
                    int x = 1;
                    while ((i+1) * x <= str.length()) {
                        char c = 'N';
                        if (str.charAt(((i + 1) * x) - 1) == 'N') c = 'Y'; 
                        str = str.substring(0, ((i + 1) * x) - 1) + c + str.substring((i + 1) * x);
                        x++;
                    }
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}