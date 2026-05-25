import java.io.*;
import java.lang.*;
import java.util.*;

/*
for 각각의 숫자:
    while k > 0 && 스택이 비어있지 않기 && 스택 마지막 숫자 < 현재 숫자:
        스택 마지막 숫자 제거
        k--
    현재 숫자 넣기
    
k > 0이라면:
    맨 뒤에서부터 k개 자르기
        
*/

class Solution {
    public String solution(String number, int k) {
        Deque<Integer> deq = new ArrayDeque<>();
        String answer = "";
        
        for (int i = 0; i < number.length(); i++) {
            int cur = number.charAt(i) - '0';
            while (k > 0 && !deq.isEmpty() && deq.peekLast() < cur) {
                deq.removeLast();
                k--;
            }
            deq.addLast(cur);
        }
        
        if (k > 0) {
            for (int i = 0; i < k; i++) {
                deq.removeLast();
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!deq.isEmpty()) {
            sb.append(deq.removeFirst());
        }
        
        answer = sb.toString();
        
        return answer;
    }
}