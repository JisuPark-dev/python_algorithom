import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int[] visited = new int[words.length];
        answer = bfs(begin, target, words, visited);
        
        return answer;
    }
    
    public int bfs(String begin, String target, String[] words, int[] visited ){
        Queue<Object[]> queue = new LinkedList<>();
        queue.add(new Object[]{begin,0});
        
        while(!queue.isEmpty()){
            Object[] current = queue.remove();
            String current_word = (String)current[0];
            int current_depth = (int)current[1];
            if(current_word.equals(target)){
                return current_depth;
            }
            
            for(int i = 0; i< words.length; i++){
                if(visited[i]==0&&oneDiffWord(current_word, words[i])){
                    visited[i]=1;
                    queue.add(new Object[]{words[i], current_depth+1});
                }
            }
        }
        return 0;
    }
    
    public boolean oneDiffWord(String a,String b){
        int cnt = 0;
        for( int i =0; i< a.length(); i++){
            if (a.charAt(i)!=b.charAt(i)){
                cnt++;
            }
        }
        if(cnt == 1){
            return true;
        }
        return false;
    }
}