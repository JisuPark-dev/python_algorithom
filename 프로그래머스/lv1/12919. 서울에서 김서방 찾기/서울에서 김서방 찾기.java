import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";
        int idx= 0;
        for(int i =0; i<seoul.length; i++){
            if (seoul[i].equals("Kim")){
                idx = i;
                break;
            }
        }
        String c = idx+"";
        return "김서방은 "+c+"에 있다";
    }
}