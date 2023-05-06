class Solution {
    public String solution(String str) {
        String answer = "";
        StringBuilder sb = new StringBuilder(str);
        for(int i =0; i<str.length()-4; i++){
            sb.setCharAt(i, '*');
        }
        str = sb.toString();
        return str;
    }
}