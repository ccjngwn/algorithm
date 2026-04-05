import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            int cur_stock = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                answer[i]++;
                int comp_stock = prices[j];
                if (cur_stock > comp_stock) {
                    break;
                }
            }
        }
        
        return answer;
    }
}