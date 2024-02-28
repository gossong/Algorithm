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
        int h = Integer.parseInt(st.nextToken());
        
        int[] dx = {1, 0, 0, -1, 0, 0};
        int[] dy = {0, 1, 0, 0, -1, 0};
        int[] dz = {0, 0, 1, 0, 0, -1};
        
        int[][][] board = new int[h][n][m];
        int[][][] dist = new int[h][n][m];
        
        Queue<int[]> que = new LinkedList<>();
        
        for(int i = 0; i < h; i++) {
        	for(int j = 0; j < n; j++) {
            	st = new StringTokenizer(br.readLine());
        		for(int k = 0; k < m; k++) {
        			int tomato = Integer.parseInt(st.nextToken());
            		board[i][j][k] = tomato;
            		if(tomato == 1) { // 익은 토마토일 경우, 큐에 넣기
            			que.add(new int[] {i, j, k});
            		} else if(tomato == 0) { // 익지 않은 토마토일 경우, dist -1로 설정
            			dist[i][j][k] = -1;
            		}
        		}
        	}
        }
        
        while(!que.isEmpty()) {
        	int[] cur = que.poll();
        	for(int dir = 0; dir < 6; dir++) {
        		int nz = cur[0] + dx[dir];
        		int nx = cur[1] + dy[dir];
        		int ny = cur[2] + dz[dir];
        		
        		if(nx < 0 || nx >= n || ny < 0 || ny >= m || nz < 0 || nz >= h) continue;
        		if(dist[nz][nx][ny] >= 0) continue;
        		
        		dist[nz][nx][ny] = dist[cur[0]][cur[1]][cur[2]] + 1;
        		que.add(new int[] {nz, nx, ny});
        	}
        }
        
        int ans = 0;
        for(int i = 0; i < h; i++) {
        	for(int j = 0; j < n; j++) {
        		for(int k = 0; k < m; k++) {
        			if(dist[i][j][k] == -1) { // 토마토가 없을 경우 
            			System.out.println(-1);
            			return;
            		}
            		ans = Math.max(ans, dist[i][j][k]);
        		}
        	}
        }
        
        System.out.println(ans);
        
    }
}
