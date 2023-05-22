import java.util.TreeMap;

class Solution {
    public String solution(String s) {
        TreeMap<String, Integer> map = new TreeMap<>();
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i< s.length(); i++){
            String tmp = String.valueOf(s.charAt(i));
            if(map.containsKey(tmp)){
                map.put(tmp,map.get(tmp)+1);
            }else{
                map.put(tmp, 1);
            }
        }
        
        map.forEach((key, value)->{
            if(value == 1){
                answer.append(key);
            }
        });
        
    return answer.toString();
    }
}