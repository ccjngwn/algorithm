import java.util.*;
import java.lang.*;
import java.io.*;

/*
배열에 입력 받기, 정답 배열을 -1로 초기화하기
배열을 한 번 순회하며 stack에 index push해두기
    stack이 비어있지 않고 현재 배열의 값이 stack의 인덱스의 배열 값보다 크다면 pop하고 정답 배열에 기록
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] ans = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            ans[i] = -1;
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peekLast()] < arr[i]) {
                int k = stack.pollLast();
                ans[k] = arr[i];
            }

            stack.addLast(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(ans[i]).append(" ");
        }

        System.out.println(sb);
    }
}