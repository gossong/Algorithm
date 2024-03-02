import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static int n;
	static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static String[] board;
    static boolean[][] vis;
	
	public static int bfs(int x, int y) {
		
		Queue<int[]> que = new LinkedList<>();
		que.add(new int[] {x, y}); // 해당 좌표
		vis[x][y] = true; // 방문 처리
		int size = 1;
		
		while(!que.isEmpty()) {
			int[] cur = que.poll();
			
			for(int dir = 0; dir < 4; dir++) {
				int nx = cur[0] + dx[dir];
				int ny = cur[1] + dy[dir];
				
				if(nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
				if(vis[nx][ny] || board[nx].charAt(ny) != '1') continue;
				
				if(board[nx].charAt(ny) == '1') {
					size++;
					vis[nx][ny] = true;
					que.add(new int[] {nx, ny});
				}
			}
		}
		
		return size;
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine()); // 지도의 크기
        
        int cnt = 0; // 총 단지 수
        List<Integer> list = new ArrayList<>();
        
        board = new String[n];
        vis = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
        	board[i] = br.readLine();
        }
        
        for(int i = 0; i < n; i++) {
    	   for(int j = 0; j < n; j++) {
    		   if(board[i].charAt(j) == '1' && !vis[i][j]) { // 색칠이 된 부분(1) & 방문하지 않은 곳
    			   list.add(bfs(i, j));
    			   cnt++;
    		   }
    	   }
        }
        
        System.out.println(cnt);
        Collections.sort(list); // ArrayList 오름차순 정렬
        for(int i = 0; i < list.size(); i++) {
        	System.out.println(list.get(i));
        }
    }
}
