import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            list.add(String.valueOf(numbers[i]));
        }
        
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));
        
        if (list.get(0).equals("0")) {
            return "0";
        }
        
        for (String i : list) {
            sb.append(i);
        }
         
        String answer = sb.toString();
        
        return answer;
    }
}