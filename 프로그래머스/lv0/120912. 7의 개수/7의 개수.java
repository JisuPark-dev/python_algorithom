class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i:array){
            String[] str = (i+"").split("");
            for(int j =0; j<str.length; j++){
                if(str[j].equals("7"))answer++;
            }
        }
        return answer;
    }
}