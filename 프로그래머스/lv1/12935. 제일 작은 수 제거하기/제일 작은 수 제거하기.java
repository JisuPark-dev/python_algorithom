import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[]{};
        
        if (arr.length ==1){
            int[] answer2 = {-1};
            return answer2;
        }
        int min = arr[0];
        int idx = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
                idx = i;
            }
        }
        //배열을 리스트로 변환 후 최솟값 제거
        ArrayList<Integer> list = (ArrayList)Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(idx);
        //리스트를 배열로 변환
    
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}