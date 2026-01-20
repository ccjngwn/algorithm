import java.util.*;
import java.lang.*;
import java.io.*;

/**
1. 새의 수 N 입력받기
2. 새의 수가 i보다 작다면 i = 1
3. i = 1부터 반복문 돌면서 새의 수에서 i만큼 -하기 + sec 1만큼 증가시키기
*/
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String s = st.nextToken();
            hm.put(s, 0);
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                int a = hm.get(s) + 1;
                hm.put(s, a);
            }
        }

        List<String> keySet = new ArrayList<>(hm.keySet());

        keySet.sort((o1, o2) -> {
            if (hm.get(o1) - hm.get(o2) == 0) 
                return o1.compareTo(o2);
            else
                return hm.get(o2) - hm.get(o1);
            });

        for (String key : keySet) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}