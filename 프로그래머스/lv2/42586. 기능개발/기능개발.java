import java.util.LinkedList;
import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[100];
        
        int day = 0;
        for(int i =0; i<speeds.length; i++){  
            while(progresses[i] + (speeds[i]*day)<100){
                day++;
            }
            arr[day]++;
        }
        System.out.println(arr);
        int cnt = 0;
        for(int x: arr){
            if (x!=0){
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        int count = 0;
        for(int x: arr){
            if(x!=0){
                answer[count++] = x;
            }
        }
        
        return answer;
    }
}