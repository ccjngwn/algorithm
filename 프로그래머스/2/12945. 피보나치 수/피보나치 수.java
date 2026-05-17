import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    
    int[] arr;
    
    public int solution(int n) {
        int answer = 0;
        arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        
        answer = fib(n);
        
        return answer;
    }
    
    int fib(int n) {
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1234567;
        }
        return arr[n];
    }
}