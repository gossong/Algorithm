import java.util.*;
class Solution {
    static int[] check;
    static int[][] map;
    static int num;
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new int[n];
        map = new int[n][n];
        num = n;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(computers[i][j]==1){
                    map[i][j] = 1;
                    map[j][i] = 1;
                }
            }
        }
        
        for(int i = 0; i < n; i++){
            if(check[i] != 1){
                bfs(i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public static void bfs(int x){
        Queue<Integer> que = new LinkedList<>();
        que.add(x);
        check[x] = 1;
        
        while(!que.isEmpty()){
            int cur = que.poll();
            for(int i = 0; i < num; i++){
                if(map[cur][i]==1 && check[i]!=1) {
        			que.add(i);
        			check[i] = 1;
        		}
            }
        }
    }
}