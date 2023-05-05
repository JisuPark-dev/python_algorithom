import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int[] answer = Arrays.stream(arr).sorted().filter(e->e%divisor==0).toArray();
        if(answer.length == 0){
            int[] answers = {-1};
            return answers;
        }
        Arrays.sort(answer);
        return answer;
    }
}