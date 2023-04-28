import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public boolean prime(int n){
        if (n==2)return true;
        boolean check = true;
        for(int i =2; i<=Math.sqrt(n)+1; i++){
            if(n%i ==0) check = false;
        }
        return check;
    }
    
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i<=n;i++){
            if (prime(i) && n%i ==0) arr.add(i);
        }
        return arr.stream().mapToInt(i -> i).toArray();
    }
}