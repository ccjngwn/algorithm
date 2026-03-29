import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        int k = nums.length / 2;
        answer = hs.size();
        if (answer > k) {
            answer = k;
        }
        
        return answer;
    }
}