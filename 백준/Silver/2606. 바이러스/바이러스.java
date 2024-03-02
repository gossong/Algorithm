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
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        
        int[] check = new int[n+1];
        int[][] map = new int[n+1][n+1];
        for(int i = 0; i < m; i++) {
        	st = new StringTokenizer(br.readLine()," ");
        	int start = Integer.parseInt(st.nextToken());
        	int end = Integer.parseInt(st.nextToken());
        	map[start][end] = 1; 
        	map[end][start] = 1;
        }
        
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        check[1] = 1;
        
        int cnt = 0;
        
        while(!que.isEmpty()) {
        	int cur = que.poll();
        	
        	for(int i = 1; i < map.length; i++) {
        		if(map[cur][i]==1 && check[i]!=1) { // 1과 연결된 컴퓨터의 수 찾기
        			que.add(i);
        			check[i] = 1;
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);
        
    }
}
