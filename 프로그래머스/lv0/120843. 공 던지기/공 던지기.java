class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int idx = 0;
        for(int i =0; i<k; i++){
            answer = idx;
            idx+=2;
            if(idx == numbers.length)idx = 0;
            if(idx == numbers.length+1)idx = 1;
        }
        return numbers[answer];
    }
}