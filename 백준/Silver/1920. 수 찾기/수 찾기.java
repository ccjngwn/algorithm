import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int find = Integer.parseInt(st.nextToken());
            int left = 0;
            int right = n - 1;
            int mid = (left + right) / 2;
            boolean flag = false;

            while (left <= right) {
                int k = list.get(mid);
                if (k > find) {
                    right = mid - 1;
                } else if (k < find) {
                    left = mid + 1;
                } else {
                    flag = true;
                    break;
                }

                mid = (left + right) / 2;
            }

            if (flag) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}