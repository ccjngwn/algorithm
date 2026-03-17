import java.util.*;
import java.lang.*;
import java.io.*;

/*
1. 문자열 뽑기
2. 개수 확인 -> 맞으면 count++
3. 앞에 문자 개수 -, 뒤에 문자 개수 +
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        String dna = br.readLine();
        st = new StringTokenizer(br.readLine());
        int[] acgt = new int[4];
        for (int i = 0; i < 4; i++) {
            acgt[i] = Integer.parseInt(st.nextToken());
        }
        int[] count = new int[4];

        int start = 0;
        int end = start + p - 1;
        String str = dna.substring(start, end + 1);
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A') count[0]++;
            else if (c == 'C') count[1]++;
            else if (c == 'G') count[2]++;
            else if (c == 'T') count[3]++;
        }

        int ans = 0;
        while (start <= s - p) {
            if (count[0] >= acgt[0] && count[1] >= acgt[1] && count[2] >= acgt[2] && count[3] >= acgt[3]) ans++;
            char c2 = dna.charAt(start);
            if (c2 == 'A') count[0]--;
            else if (c2 == 'C') count[1]--;
            else if (c2 == 'G') count[2]--;
            else if (c2 == 'T') count[3]--;

            start++;
            if (start > s - p) break;
            end = start + p - 1;
            char c3 = dna.charAt(end);
            if (c3 == 'A') count[0]++;
            else if (c3 == 'C') count[1]++;
            else if (c3 == 'G') count[2]++;
            else if (c3 == 'T') count[3]++;
        }

        System.out.println(ans);
    }
}