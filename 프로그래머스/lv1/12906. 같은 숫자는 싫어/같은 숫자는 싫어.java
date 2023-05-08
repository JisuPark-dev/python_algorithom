import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int []arr) {
        //중복 체크 리스트를 만든다.
        //중복체크 리스트에서 있으면 빼고 없으면 추가한다. 
        int[] answer = {};
        
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0; i< arr.length; i++){
            if (i == 0){
                    ans.add(arr[i]);    
                }else{
                    if(arr[i] !=arr[i-1]){
                        ans.add(arr[i]);
                }    
            } 
        }
        
        answer = ans.stream().mapToInt(Integer::intValue).toArray();
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(Arrays.toString(answer));

        return answer;
    }
}