import java.util.*;
import java.lang.*;
import java.io.*;

/**
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

        // sort는 음수를 반환하면 o1을 앞에 배치, 양수를 반환하면 o2를 앞에 배치
        keySet.sort((o1, o2) -> {
            if (hm.get(o1) - hm.get(o2) == 0) // o1과 o2의 값이 같다면
                return o1.compareTo(o2); // 사전순 정렬
            // compareTo는 o1이 o2보다 작으면 음수, 같으면 0, o1이 크면 양수를 반환 -> 그거에 맞춰서 순서 조정
            else
                return hm.get(o2) - hm.get(o1); // 음수면 o1이 앞에, 양수면 o1이 뒤에
            });

        for (String key : keySet) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}