import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] board;
	static boolean[][] vis;
	static int M, N;
	static int[] dx = {1, 0, -1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	public static void bfs(int x, int y) {
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x,y});
		vis[x][y] = true;
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			for(int dir = 0; dir < 4; dir++) {
				int nx = cur[0] + dx[dir];
				int ny = cur[1] + dy[dir];
				
				if(nx < 0 || nx >= M || ny < 0 || ny >= N) continue;
				if(board[nx][ny] != 1 || vis[nx][ny]) continue;
				
				if(board[nx][ny] == 1) {
					vis[nx][ny] = true;
					que.add(new int[] {nx, ny});
				}
			}
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        
        int tc = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < tc; i++) {
        	int cnt = 0;
        	st = new StringTokenizer(br.readLine());
        	M = Integer.parseInt(st.nextToken());
        	N = Integer.parseInt(st.nextToken());
        	int num = Integer.parseInt(st.nextToken());
        	
        	board = new int[M][N];
        	vis = new boolean[M][N];
        	
        	while(num > 0) {
        		st = new StringTokenizer(br.readLine());
        		int start = Integer.parseInt(st.nextToken());
        		int end = Integer.parseInt(st.nextToken());
        		board[start][end] = 1; // 배추 1
        		num--;
        	}
        	
        	for(int j = 0; j < M; j++) {
        		for(int k = 0; k < N; k++) {
        			if(board[j][k]==1 && !vis[j][k]) {
        				bfs(j,k);
        				cnt++;
        			}
        		}
        	}
        	list.add(cnt);
        }
        for(int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
        }
    }
}
