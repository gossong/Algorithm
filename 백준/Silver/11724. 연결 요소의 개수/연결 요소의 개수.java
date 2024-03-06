import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N; // 정점의 개수
	static int M; // 간선의 개수
	static int[] check;
	static int[][] map;
	static int cnt; // 연결 요소의 개수
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        check = new int[N+1];
        map = new int[N+1][N+1];
        cnt = 0;
        
        while(M > 0) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	map[a][b] = 1; // 간선 연결
        	map[b][a] = 1;
        	M--;
        }
        
        for(int i = 1; i <= N; i++) {
        	if(check[i] != 1) {
        		bfs(i);
        		cnt++;
        	}
        }
        
        System.out.println(cnt);
    }
    
    static void bfs(int x) {
    	Queue<Integer> que = new LinkedList<>();
        que.add(x);
        
        while(!que.isEmpty()) {
        	int cur = que.poll();
        	for(int i = 1; i <= N; i++) {
        		if(map[cur][i]==1 && check[i]!=1) {
        			que.add(i);
        			check[i] = 1; // 방문했다고 표시
        		}
            }
        }
    }
}
