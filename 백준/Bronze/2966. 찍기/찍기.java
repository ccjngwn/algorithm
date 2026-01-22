import java.util.*;
import java.lang.*;
import java.io.*;

/**
N과 문자열 입력받기
char 배열 만들어두기 - 상근, 창영, 현진 순
N까지 i를 하나씩 증가시키면서 i % 3, 4, 6일 때 배열 값과 charAt이 같은지 비교해서 count++
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        char[] s = {'A', 'B', 'C'};
        char[] c = {'B', 'A', 'B', 'C'};
        char[] h = {'C', 'C', 'A', 'A', 'B', 'B'};

        HashMap<String, Integer> count = new HashMap<>();
        count.put("Adrian", 0);
        count.put("Bruno", 0);
        count.put("Goran", 0);

        for (int i = 0; i < N; i++) {
            char c1 = str.charAt(i);
            if (c1 == s[i % 3]) count.put("Adrian", count.get("Adrian") + 1);
            if (c1 == c[i % 4]) count.put("Bruno", count.get("Bruno") + 1);
            if (c1 == h[i % 6]) count.put("Goran", count.get("Goran") + 1);
        }

        int max = 0;
        for (String name : count.keySet()) {
            if (max < count.get(name)) max = count.get(name);
        }
        
        System.out.println(max);
        if (max == count.get("Adrian")) System.out.println("Adrian");
        if (max == count.get("Bruno")) System.out.println("Bruno");
        if (max == count.get("Goran")) System.out.println("Goran");
    }
}