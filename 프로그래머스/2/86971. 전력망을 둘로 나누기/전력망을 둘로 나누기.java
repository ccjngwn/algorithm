import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
    
    boolean[] visited;
    
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
            visited = new boolean[n + 1];
            
            int count = dfs(1, wires, i);
            int other = n - count;
            int diff = Math.abs(count - other);
            
            answer = Math.min(answer, diff);
        }
        
        return answer;
    }
    
    int dfs(int start, int[][] wires, int cutIdx) {
        
        visited[start] = true;
        
        int count = 1;
        
        for (int i = 0; i < wires.length; i++) {
            if (i == cutIdx) continue;
            
            int a = wires[i][0];
            int b = wires[i][1];
            
            if (a == start && !visited[b]) {
                count += dfs(b, wires, cutIdx);
            }
            
            if (b == start && !visited[a]) {
                count += dfs(a, wires, cutIdx);
            }
        }
        
        return count;
    }
    
}