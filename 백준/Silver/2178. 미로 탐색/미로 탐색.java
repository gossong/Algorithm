import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        String[] board = new String[n];
        for(int i = 0; i < n; i++) {
        	board[i] = br.readLine();
        }
        
        int[][] dist = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1); // 배열을 -1로 초기화        	
        }
        
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[] {0, 0});
        dist[0][0] = 0;
        
        int[] dx = { 1, 0, -1, 0};
        int[] dy = { 0, 1, 0, -1};
        
        while(!que.isEmpty()) {
        	int[] cur = que.poll();
        	int cx = cur[0];
        	int cy = cur[1];
        	
        	for(int dir = 0; dir < 4; dir++) {
        		int nx = cx + dx[dir];
                int ny = cy + dy[dir];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (dist[nx][ny] >= 0 || board[nx].charAt(ny) != '1') continue;

                dist[nx][ny] = dist[cx][cy] + 1;
                que.add(new int[]{nx, ny});
        	}
        }
        System.out.println(dist[n - 1][m - 1] + 1); // 문제의 특성상 거리+1이 정답
    }
}
