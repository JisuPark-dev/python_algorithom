class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        int[] visited = new int[computers.length+1];
        visited[0] = 1;
        
        for(int i = 1; i< visited.length; i++){
            if (visited[i] == 0){
                dfs(computers, i, visited);
                
                answer++;
            }
        }
        return answer;
    }
    
    public void dfs(int[][] computers,int i, int[] visited){
        for(int j=0; j<computers[i-1].length; j++){    
            if(visited[j+1] ==0&&computers[i-1][j] == 1){
                System.out.println(j+1);
                visited[j+1] = 1;
                dfs(computers,j+1, visited);
            }
        }
    }
}