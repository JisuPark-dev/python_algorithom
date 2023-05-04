import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        long x3 = (long)x;
        long x2 =(long)x;
        
        ArrayList<Long> arr = new ArrayList<>();
        for(int i = 0; i<n; i++){
            arr.add((long)x3);
            x3+=x2;
        }
        System.out.println(arr);
        return arr.stream().mapToLong(Long::longValue).toArray();
    }
}