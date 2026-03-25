import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        
        LinkedHashSet<String> hs = new LinkedHashSet<>();

        for (int i = 0; i < l; i++) {
            String studentId = br.readLine();
            if (hs.contains(studentId)) hs.remove(studentId);
            hs.add(studentId);
        }

        Iterator iter = hs.iterator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k && iter.hasNext(); i++) {
            sb.append(iter.next()).append("\n");
        }

        System.out.print(sb);
    }
}