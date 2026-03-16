import java.util.*;
import java.lang.*;
import java.io.*;

/*
1. 입력
2. 정렬
3. left = 0, right = n - 1
4. sum > m -> right - 1
    sum < m -> left + 1
    sum = m -> count++, left + 1
5. count 출력
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        int left = 0;
        int right = n - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] > m) right--;
            else if (nums[left] + nums[right] < m) left++;
            else {
                left++;
                count++;
            }
        }

        System.out.println(count);
    }
}