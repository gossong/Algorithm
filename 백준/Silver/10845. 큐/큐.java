import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int last = 0;
		
		// 명령어 개수 n
		int n = Integer.parseInt(br.readLine());
		while(n!=0) {
			
			// 명령어
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			if(command.equals("push")) {
				last = Integer.parseInt(st.nextToken());
				queue.add(last);
				
			}else if(command.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1).append('\n');
					
				}else {
					sb.append(queue.remove()).append('\n');
				}
				
			}else if(command.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				
			}else if(command.equals("size")) {
				sb.append(queue.size()).append('\n');
				
			}else if(command.equals("front")) {
				if(queue.isEmpty()){
					sb.append(-1).append('\n');
				}else {
					sb.append(queue.peek()).append('\n');
				}
				
			}else {
				if(queue.isEmpty()){
					sb.append(-1).append('\n');
				}else {
					sb.append(last).append('\n');
				}
			}
			n--;
		}
		
		System.out.println(sb);
		
	}
}