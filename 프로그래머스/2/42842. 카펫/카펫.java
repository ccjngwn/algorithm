import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        int size = brown + yellow;
        
        int[] answer = new int[2];
        
        for (int i = 3; i <= size / 2; i++) {
            if (size % i == 0) {
                int width = Math.max(i, size / i);
                int height = Math.min(i, size / i );
                if (brown == (width * 2 + (height - 2) * 2)) {
                    answer[0] = width;
                    answer[1] = height;
                }
            }
        }
        
        return answer;
    }
}