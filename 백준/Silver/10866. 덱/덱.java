import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> deque = new ArrayDeque<>();
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		int last = 0;

		int n = Integer.parseInt(br.readLine());
		while(n!=0) {
			
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			if(command.equals("push_front")) {
				last = Integer.parseInt(st.nextToken());
				deque.push(last);
				
			}else if(command.equals("push_back")) {
				last = Integer.parseInt(st.nextToken());
				deque.addLast(last);
				
			}else if(command.equals("pop_front")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
					
				}else {
					sb.append(deque.remove()).append('\n');
				}
				
			}else if(command.equals("pop_back")) {
				if(deque.isEmpty()) {
					sb.append(-1).append('\n');
					
				}else {
					sb.append(deque.removeLast()).append('\n');
				}
				
			}else if(command.equals("empty")) {
				if(deque.isEmpty()) {
					sb.append(1).append('\n');
				}else {
					sb.append(0).append('\n');
				}
				
			}else if(command.equals("size")) {
				sb.append(deque.size()).append('\n');
				
			}else if(command.equals("front")) {
				if(deque.isEmpty()){
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.peek()).append('\n');
				}
				
			}else {
				if(deque.isEmpty()){
					sb.append(-1).append('\n');
				}else {
					sb.append(deque.peekLast()).append('\n');
				}
			}
			n--;
		}
		
		System.out.println(sb);
		
	}
}