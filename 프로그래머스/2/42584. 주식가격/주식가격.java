import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        // for (int i = 0; i < prices.length; i++) {
        //     int cur_stock = prices[i];
        //     for (int j = i + 1; j < prices.length; j++) {
        //         answer[i]++;
        //         int comp_stock = prices[j];
        //         if (cur_stock > comp_stock) {
        //             break;
        //         }
        //     }
        // }
        
        Deque<Integer> deq = new ArrayDeque<>();
        
        for (int i = 0; i < prices.length; i++) {
            while (!deq.isEmpty() && prices[deq.peekLast()] > prices[i]) {
                int cur = deq.removeLast();
                answer[cur] = i - cur;
            }
            
            deq.addLast(i);
        }
        
        while (!deq.isEmpty()) {
            int cur = deq.removeLast();
            answer[cur] = prices.length - cur - 1;
        }
        
        return answer;
    }
}