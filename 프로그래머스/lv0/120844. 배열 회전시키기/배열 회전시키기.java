import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0; i< numbers.length; i++){
            list.add(numbers[i]);
        }
        
        if(direction.equals("right")){
            int n = list.pollLast();
            list.addFirst(n);
        }else{
            int n = list.pollFirst();
            list.addLast(n);
        }
        System.out.println(list);
        answer= list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}