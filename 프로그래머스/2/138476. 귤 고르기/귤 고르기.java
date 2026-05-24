// 1. 반복문 돌며 map에 크기와 개수 저장
// 2. 개수 큰 것부터 커스텀 정렬
// 3. 개수 큰 것부터 k 만족할 때까지 ++

import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < tangerine.length; i++) {
            int tmp = hm.getOrDefault(tangerine[i], 0);
            hm.put(tangerine[i], tmp + 1);
        }
        
        List<Integer> list = new ArrayList<>(hm.values());
        
        Collections.sort(list);
        
        int tmp = 0;
        while (tmp < k) {
            tmp += list.remove(0);
            answer++;
        }
        
        return answer - 1;
    }
}