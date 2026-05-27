import java.io.*;
import java.lang.*;
import java.util.*;

/*
cost 오름차순으로 정렬
parent 배열 초기화
싼 간선부터 하나씩 확인
두 섬이 아직 다른 그룹이면 연결
비용 더하기
n - 1개 간선을 선택하면 종료
*/

class Solution {
    
    int[] parent;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        int count = 0;
        parent = new int[n];
        
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        
        Arrays.sort(costs, (a, b) -> a[2] - b[2]);
        
        for (int i = 0; i < costs.length; i++) {
            int[] target = costs[i];
            
            if (union(target[0], target[1])) {
                answer += target[2];
                count++;
                if (count == (n - 1)) return answer;
            }
        }
        
        return answer;
    }
    
    int find(int x) {
        if (parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    
    boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        
        if (rootA == rootB) {
            return false;
        }
        
        parent[rootB] = rootA;
        return true;
    }
}