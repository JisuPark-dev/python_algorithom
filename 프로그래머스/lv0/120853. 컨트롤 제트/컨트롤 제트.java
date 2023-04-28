import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        // int answer = 0;
//         String[] arr = s.split(" ");
//         for(int i =0; i<arr.length; i++){
//             if(arr[i].equals("Z"))arr[i-1] = "0";
//         }
//         for(int i =0; i<arr.length; i++){
//             try{
//                 System.out.println(arr[i]);
//                 Integer number = Integer.valueOf(arr[i]);
//                 answer+=number;    
//             }catch(NumberFormatException ex){
//                 ex.printStackTrace();
//             }
            
//         }
//         return answer;
        int answer = 0;
        String[] arr = s.split(" ");
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList());
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals("Z")){
                list1.remove(list1.size()-1);
            }else{
                list1.add(Integer.parseInt(arr[i]));
            }
        }
        System.out.print(list1);
        for(int a : list1){
            answer += a;
        }
       
        return answer;
    }
}   