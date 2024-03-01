import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        int[][] dist = new int[n][m];
        
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[] {0,0});
        
        for(int i = 0; i < n; i++){
            Arrays.fill(dist[i], -1); 
        }
        
        while(!que.isEmpty()){
            int[] cur = que.poll();
            dist[0][0] = 0;
            for(int dir = 0; dir < 4; dir++){
                int nx = cur[0] + dx[dir];
                int ny = cur[1] + dy[dir];
                
                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(dist[nx][ny] >= 0 || maps[nx][ny] == 0) continue;
                dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
    		    que.add(new int[] {nx, ny});
            }
        }
        
        int answer = dist[n-1][m-1] > 0 ? dist[n-1][m-1]+1 : -1;
        return answer;
    }
}