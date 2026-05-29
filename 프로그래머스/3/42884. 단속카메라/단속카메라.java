import java.io.*;
import java.lang.*;
import java.util.*;

/*
- routes를 진출 지점 기준으로 오름차순 정렬
- for (routes):
    if (route[0] > camera):
        answer++
        camera = route[1]
*/

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int camera = -30001;
        
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        
        for (int[] route : routes) {
            if (route[0] > camera) {
                answer++;
                camera = route[1];
            }
        }
        
        return answer;
    }
}