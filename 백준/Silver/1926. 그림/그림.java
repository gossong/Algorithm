import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] board;
    static boolean[][] vis;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int n, m;  // x(세로), y(가로)의 길이
    static int cnt, max, size; // 그림의 개수, 가장 넓은 그림의 넓이, 그림 하나의 넓이

    public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());  
		m = Integer.parseInt(st.nextToken());
		cnt = 0;  // 그림의 개수
		max = 0;  // 가장 넓은 그림의 넓이
		size = 0;
		
		board = new int[n][m];  // 도화지
		for(int i=0; i<n; i++) {
			 st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		vis = new boolean[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				// 색칠이 된 부분(1) & 방문하지 않은 곳(false) -> BFS 시작
				if(board[i][j] == 1 && !vis[i][j]) {
					size = 0;
					max = Math.max(max, bfs(i,j));
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
    	
    }
    static int bfs(int x, int y) {
    	Queue<int[]> Q = new LinkedList<>();
    	
        vis[x][y] = true;  // 방문 처리
        Q.add(new int[]{x, y});  // 해당 좌표
        size++;  // 사이즈++

        while (!Q.isEmpty()) {
            int[] cur = Q.poll();
            int cx = cur[0];
            int cy = cur[1];

            // 상하좌우 탐색
            for (int dir = 0; dir < 4; dir++) {
                int nx = cx + dx[dir];
                int ny = cy + dy[dir];
                
                // 새로운 좌표를 계산할 때 벽에 부딪히거나, 그림의 길이에 벗어나면 지나감
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                if (vis[nx][ny] || board[nx][ny] != 1) continue;
                
                if(board[nx][ny] == 1) {
                	size++;
                	vis[nx][ny] = true;
                    Q.add(new int[]{nx, ny});
                }
            }
        }
		return size;
	}
}
