class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minus = 100;
        for(int i = 0; i<array.length; i++){
            if(minus>Math.abs(n-array[i])){
                minus = Math.abs(n-array[i]);
                answer = array[i];
            }
            if(minus == Math.abs(n-array[i])){
                if(answer>array[i])answer = array[i];
            }
        }
        return answer;
    }
}