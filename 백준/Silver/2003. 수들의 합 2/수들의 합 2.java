import java.util.*;
import java.lang.*;
import java.io.*;

/**
    n, m 입력 받아서 배열에 세팅
    left, right 설정
    left < right일 때까지 반복
    현재 합 구하기
    sum < m이면 right 증가
    sum > m이면 left 증가
    sum == m이면 left 증가
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int left = 0;
        int right = 0;
        int count = 0;
        int sum = nums[left];

        while (right < n && left < n) {
            if (sum < m) {
                right++;
                if (right < n) {
                    sum += nums[right];
                }
            } else if (sum > m) {
                sum -= nums[left];
                left++;
            } else {
                count++;
                sum -= nums[left];
                left++;
            }
        }

        System.out.println(count);
    }
}