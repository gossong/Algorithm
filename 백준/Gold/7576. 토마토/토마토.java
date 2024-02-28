import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        
        int[][] board = new int[n][m];
        int[][] dist = new int[n][m];
        
        Queue<int[]> que = new LinkedList<>();
        
        for(int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		board[i][j] = Integer.parseInt(st.nextToken());
        		if(board[i][j] == 1) { // 익은 토마토일 경우, 큐에 넣기
        			que.add(new int[] {i, j});
        		} else if(board[i][j] == 0) { // 익지 않은 토마토일 경우, dist -1로 설정
        			dist[i][j] = -1;
        		}
        	}
        }
        
        while(!que.isEmpty()) {
        	int[] cur = que.poll();
        	for(int dir = 0; dir < 4; dir++) {
        		int nx = cur[0] + dx[dir];
        		int ny = cur[1] + dy[dir];
        		
        		if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
        		if(dist[nx][ny] >= 0) continue;
        		
        		dist[nx][ny] = dist[cur[0]][cur[1]] + 1;
        		que.add(new int[] {nx, ny});
        	}
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < m; j++) {
        		if(dist[i][j] == -1) { // 토마토가 없을 경우 
        			System.out.println(-1);
        			return;
        		}
        		ans = Math.max(ans, dist[i][j]);
        	}
        }
        
        System.out.println(ans);
    }
}
