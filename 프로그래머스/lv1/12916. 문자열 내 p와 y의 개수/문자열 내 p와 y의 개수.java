class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0; 
        int y = 0;
        
        for(int i =0; i< s.length(); i++){
            char k = s.charAt(i);
            if(k == 'p' || k =='P') p++;
            if(k == 'y' || k =='Y') y++;
        }
        return p==y?answer:!answer;
    }
}