import java.util.*;
import java.lang.*;
import java.io.*;

/*
입력
left = 0, right = left + p
배열 입력받을 때 2차원 배열로 해서 [s, 4]

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
        for (int i = 0; i < p; i++) {
            count[getIndex(dna.charAt(i))]++;
        }

        int ans = 0;
        
        while (start <= s - p) {
            if (count[0] >= acgt[0] && count[1] >= acgt[1] && count[2] >= acgt[2] && count[3] >= acgt[3]) ans++;
            char c2 = dna.charAt(start);
            count[getIndex(c2)]--;

            start++;
            if (start > s - p) break;
            end = start + p - 1;
            char c3 = dna.charAt(end);
            count[getIndex(c3)]++;
        }

        System.out.println(ans);
    }
    
    private static int getIndex(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            default:
                return 3;
        }
    }
}