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
        int k = Integer.parseInt(st.nextToken());
        
        int[] dist = new int[100002];
        Arrays.fill(dist, -1);
        Queue<Integer> que = new LinkedList<>();
        que.add(n);
        dist[n] = 0;
        
        while(dist[k]==-1) {
        	int cur = que.poll();
        	int[] next = {cur-1, cur+1, cur*2};
        	
        	for(int nxt : next) {
        		if(nxt < 0 || nxt > 100000) continue;
        		if(dist[nxt] >= 0) continue;
        		
        		dist[nxt] = dist[cur] + 1;
        		que.add(nxt);
        	}
        }
        System.out.println(dist[k]);
    }
}
