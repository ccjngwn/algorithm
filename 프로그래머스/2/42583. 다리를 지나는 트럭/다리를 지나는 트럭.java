import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Deque<Integer> truck = new ArrayDeque<>();
        Deque<int[]> deq = new ArrayDeque<>();
        
        int cur_weight = 0;
        for (int i = 0 ; i < truck_weights.length; i++) {
            truck.addLast(truck_weights[i]);
        }
        
        while (!truck.isEmpty() || !deq.isEmpty()) {
            answer++;
            
            if (!deq.isEmpty()) {
                int[] cross = deq.peekFirst();
                if (answer == cross[1] + bridge_length) {
                    deq.removeFirst();
                    cur_weight -= cross[0];
                }
            }
            
            if (!truck.isEmpty()) {
                if (cur_weight + truck.peekFirst() <= weight) {
                    int cur_truck = (int) truck.removeFirst();
                    deq.addLast(new int[]{cur_truck, answer});
                    cur_weight += cur_truck;
                }
            }
        }
        
        return answer;
    }
}