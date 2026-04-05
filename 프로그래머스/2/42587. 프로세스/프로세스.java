import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        Deque<Integer> deq = new ArrayDeque<>();
        
        for (int i = 0; i < priorities.length; i++) {
            deq.addLast(i);
        }
        
        while (true) {
            int idx = (int)deq.removeFirst();
            if (Arrays.stream(priorities).max().getAsInt() == priorities[idx]) {
                answer++;
                priorities[idx] = 0;
                if (location == idx) {
                    break;
                }
            } else {
                deq.addLast(idx);
            }
        }
        
        return answer;
    }
}