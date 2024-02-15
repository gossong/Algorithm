import java.io.*;
import java.util.*;
public class Main{
	static int[] dx = {1, 0, -1, 0}; // 남, 동, 북, 서 순서
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static int[][] board1; // 최초에 입력받은 board를 저장할 변수
	static int[][] board2; // 사각 지대의 개수를 세기 위해 사용할 변수
	static ArrayList<int[]> cctv; // cctv의 좌표를 저장할 변수
	
	static boolean OOB(int a, int b) { // (a,b)가 범위를 벗어났는지 체크하는 함수
		return a < 0 || a >= n || b < 0 || b >= m;
	}
	
	// (x,y)에서 dir 방향으로 진행하면서 벽을 만날 때까지 지나치는 모든 빈칸을 7로 바꾸는 함수
	static void upd(int x, int y, int dir) {
		dir %= 4;
		while(true) {
			x += dx[dir];
			y += dy[dir];
			if(OOB(x,y) || board2[x][y] == 6) return; // 범위를 벗어났거나 벽을 만나면 함수를 탈출
			if(board2[x][y] != 0) continue; // cctv가 있을 경우(해당 칸이 빈칸이 아닐 경우) 넘어감
			board2[x][y] = 7; // 빈칸을 7로 덮음
		}
	}
    
    public static void main(String args[]) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        board1 = new int[n][m];
        board2 = new int[n][m];
        cctv = new ArrayList<>();
        
        int mn = 0; // 사각 지대의 최소 크기 (답)
        
        for(int i = 0; i < n; i++) {  // board1 입력
        	st = new StringTokenizer(br.readLine());
        	for(int j = 0; j < m; j++) {
        		board1[i][j] = Integer.parseInt(st.nextToken());
        		if(board1[i][j] != 0 && board1[i][j] != 6) {
        			cctv.add(new int[] {i, j});  // ArrayList에 cctv 좌표 추가
        		}
        		if(board1[i][j] == 0) mn++; // 초기 빈칸 갯수 저장
        	}
        }
        
        // 각 cctv가 4개의 방향을 가진다고 생각하고 코드 작성 (중복 계산이 발생하지만, 편하게 짜기 위해서)
        // 1 << (2*cctv.size()는 4의 cctv.size()승을 의미
        for(int tmp = 0; tmp < (1 << 2 * cctv.size()); tmp++) { // tmp를 4진법으로 뒀을 때 각 자리수를 cctv의 방향으로 생각
        	
        	for(int i = 0; i < n; i++) { // board2에 board1 복사
        		for(int j = 0; j < m; j++) {
        			board2[i][j] = board1[i][j];
        		}
        	}
        	
        	int brute = tmp;
        	for(int i = 0; i < cctv.size(); i++) {
        		int dir = brute % 4; // 4로 나눈 나머지를 뽑아 양방향으로 사용하고
        		brute /= 4; // brute를 4로 나누는 작업을 반복해서 tmp 값을 4진법으로 해체
        		// x, y에 cctv의 좌표를 담는다
        		int x = cctv.get(i)[0];
        		int y = cctv.get(i)[1];
        		
        		if(board1[x][y] == 1) {
        			upd(x, y, dir);
        		} else if(board1[x][y] == 2) {
        			upd(x, y, dir);
        			upd(x, y, dir + 2);
        		} else if(board1[x][y] == 3) {
        			upd(x, y, dir);
        			upd(x, y, dir + 1);
        		} else if(board1[x][y] == 4) {
        			upd(x, y, dir);
        			upd(x, y, dir + 1);
        			upd(x, y, dir + 2);
        		} else { // board1[x][y] == 5
        			upd(x, y, dir);
        			upd(x, y, dir + 1);
        			upd(x, y, dir + 2);
        			upd(x, y, dir + 3);
        		}
        	}
        	
        	int val = 0;
        	for (int i = 0; i < n; i++)
                for (int j = 0; j < m; j++)
                	val += (board2[i][j]==0 ? 1 : 0);
            mn = Math.min(mn, val);
        }
        System.out.println(mn);
    }
}