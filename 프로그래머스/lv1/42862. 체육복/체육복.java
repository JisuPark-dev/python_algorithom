import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+1];
        student[0] = 1;
        Loop1:
        for(int l: lost){
            for(int i =0; i<reserve.length; i++){
                if (l == reserve[i]){
                    reserve[i] = 0;
                    continue Loop1;
                }
            }
            student[l] = 1;
            
        }
        Arrays.sort(reserve);
        
        for(int r: reserve){
            if(r == 0){
                continue;
            }
            if(r == 1){
                student[2] = 0;
                continue;
            }
            if(r == n){
                student[n-1] = 0;
                continue;
            }
            if(student[r-1] == 1){
                student[r-1] = 0;
            }else{
                student[r+1] = 0;
            }
        }
        System.out.println(Arrays.toString(student));
        
        for(int i :student){
            if (i == 0){
                answer++;
            }
        }
        return answer;
    }
}