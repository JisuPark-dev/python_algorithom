import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() == 0) return "";
        if(s.length() == 1) return s;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);//s문자열 정렬
        
        if(chars[0]!=chars[1])answer+=chars[0];
        
        for(int i =1; i<chars.length-1; i++){
            if(chars[i]!=chars[i-1]&& chars[i]!= chars[i+1])answer+=chars[i];
        }
        if(chars[chars.length-2]!=chars[chars.length-1])answer+=chars[chars.length-1];
        return answer;
    }
}