// 1. uuid와 닉네임을 담는 hm 생성
// 2. record를 돌면서 change만 찾아서 uuid에 따른 닉네임 변경
// 3. StringTokenizer와 StringBuilder로 결과 출력

import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
    public String[] solution(String[] record) {
        
        StringBuilder sb;
        StringTokenizer st;
        HashMap<String, String> hm = new HashMap<>();
        
        ArrayList<String> list = new ArrayList<>();
        
        for (String str : record) {
            st = new StringTokenizer(str);
            String command = st.nextToken();
            if (command.equals("Enter") || command.equals("Change")) {
                hm.put(st.nextToken(), st.nextToken());
            }
        }
        
        for (String str : record) {
            st = new StringTokenizer(str);
            sb = new StringBuilder();
            
            String command = st.nextToken();
            String name = hm.get(st.nextToken());
            
            switch (command) {
                case "Enter":
                    sb.append(name).append("님이 들어왔습니다.");
                    list.add(sb.toString());
                    break;
                case "Leave":
                    sb.append(name).append("님이 나갔습니다.");
                    list.add(sb.toString());
                    break;
            }
        }
        
        String[] answer = list.toArray(new String[0]);
        
        return answer;
    }
}