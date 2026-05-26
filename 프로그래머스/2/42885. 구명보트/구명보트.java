import java.io.*;
import java.util.*;
import java.lang.*;

/*
people 정렬(내림차순)후 deq에 삽입
맨 앞 + 맨 뒤 > limit:
    answer++
    맨 앞 제거
else:
    answer++
    맨 앞, 맨 뒤 제거
*/

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);
        
        Deque<Integer> deq = new ArrayDeque<>();
        
        for (int i : people) {
            deq.addFirst(i);
        }
        
        int answer = 0;
        
        while (!deq.isEmpty()) {
            if (deq.size() == 1) {
                answer++;
                deq.remove();
                break;
            }
            
            answer++;
            if (deq.peekFirst() + deq.peekLast() <= limit) {
                deq.removeLast();
            }
            deq.removeFirst();
        }
        
        return answer;
    }
}