import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int leng = emergency.length;
        int[] answer = new int[leng];
        int[] new_emergency = emergency.clone();//정렬할 클론 배열 생성
        Arrays.sort(new_emergency);//작은 것부터 큰 것 순서대로 
        int[] reversed_emergency = new int[leng]; // 큰 것에서 작은 것 순서대로
        
        for(int i =0; i<leng; i++){
            int temp = new_emergency[i];
            reversed_emergency[i] = new_emergency[leng - i-1];
            new_emergency[i] = temp; 
        }
        
        
        for( int i =0; i<leng; i++){
            int idx = 0;
            for(int j =0; j<leng; j++){
                if (emergency[i] == reversed_emergency[j]) idx = j;
                answer[i] = idx+1;
            }
            
        }
        
        return answer;
    }
}