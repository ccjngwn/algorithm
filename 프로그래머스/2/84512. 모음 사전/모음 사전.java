import java.io.*;
import java.lang.*;
import java.util.*;

class Solution {
    
    String[] words = {"A", "E", "I", "O", "U"};
    ArrayList<String> list;
    
    public int solution(String word) {
        int answer = 0;
        
        list = new ArrayList<>();
        dfs("", 0);
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    void dfs(String str, int depth) {
        list.add(str);
        if (depth == 5) return;
        
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], depth + 1);
        }
    }
}