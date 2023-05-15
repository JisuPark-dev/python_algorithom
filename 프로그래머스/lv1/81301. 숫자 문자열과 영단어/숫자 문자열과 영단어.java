class Solution {
    public int solution(String s) {
        
        String[] String_num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i<10;i++){
            String String_i = i+"";
            s =s.replaceAll(String_num[i],String_i);   
        }
        
        return Integer.valueOf(s);
    }
}