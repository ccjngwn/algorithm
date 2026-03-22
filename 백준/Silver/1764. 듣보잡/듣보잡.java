import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<String> listen = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listen.add(br.readLine());
        }

        Collections.sort(listen);
        
        for (int i = 0; i < m; i++) {
            String see = br.readLine();

            int left = 0;
            int right = n - 1;
            int mid = (left + right) / 2;

            while (left <= right) {
                if (listen.get(mid).compareTo(see) > 0) {
                    right = mid - 1;
                } else if (listen.get(mid).compareTo(see) < 0) {
                    left = mid + 1;
                } else {
                    ans.add(listen.get(mid));
                    break;
                }

                mid = (left + right) / 2;
            }
        }

        Collections.sort(ans);
        StringBuilder sb = new StringBuilder();
        sb.append(ans.size()).append("\n");
        for (int i = 0; i < ans.size(); i++) {
            sb.append(ans.get(i)).append("\n");
        }

        System.out.println(sb);
    }
}