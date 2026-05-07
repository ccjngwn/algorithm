import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int w = 0; int h = 0;
        for (int i = 0; i < sizes.length; i++) {
            int big = Math.max(sizes[i][0], sizes[i][1]);
            int small = Math.min(sizes[i][0], sizes[i][1]);
            
            if (w < big) w = big;
            if (h < small) h = small;
        }
        
        answer = w * h;
        
        return answer;
    }
}