class Solution {
    public boolean solution(int x) {
        int sum = 0;
        String str = x+""; // 숫자 -> 문자열
        String[] arr = str.split(""); // 문자열 -> 문자 배열
        for(String i:arr){
            sum+=Integer.valueOf(i); // 문자열 -> 숫자
        }
        return x%sum==0?true:false;
    }
}