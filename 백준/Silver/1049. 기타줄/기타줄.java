import java.util.*;
import java.lang.*;
import java.io.*;

/**
굳이 저장할 필요 x
M번 반복 돌면서 비교하기
최솟값 = 1000 * N으로 가정
반복문 돌면서 최소 6개 가격, 최소 1개 가격 받아오기
6개 가격 < 1개 가격 * 6 -> N / 6 * (6개 가격) + N % 6 * (1개 가격)
6개 가격 > 1개 가격 * 6 -> N * (1개 가격)
price가 최솟값보다 작으면 최솟값 = price
반목문 끝나고 최솟값 출력
*/
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int min = 1000 * N;
        int six = 1000 * 6;
        int one = 1000;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int tmpSix = Integer.parseInt(st.nextToken());
            int tmpOne = Integer.parseInt(st.nextToken());
            if (six > tmpSix) six = tmpSix;
            if (one > tmpOne) one = tmpOne;
        }

        int price;
        if (six < one * 6) {
            if (six > N % 6 * one) {
                price = N / 6 * six + N % 6 * one;  
            } else {
                price = (N / 6 + 1) * six;
            }
        } else {
            price = N * one;
        }
        if (price < min) {
            min = price;
        }

        System.out.println(min);
    }
}