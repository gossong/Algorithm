import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final int MX = 1000005;
    static int[] dat = new int[MX];
    static int head = 0, tail = 0;
    
    static void push(int x){
    	dat[tail++] = x;
    }
    
    static int pop() {
    	if(tail-head==0) {
    		return -1;
    	}else {
    		return dat[head++];
    	}
    	
    }
    
    static int size() {
    	return tail-head;
    }
    
    static int empty() {
    	if(tail-head == 0) {
    		return 1;
    	}else {
    		return 0;
    	}
    
    }
    
    static int front() {
    	if(tail-head==0) {
    		return -1;
    	}else {
    		return dat[head];
    	}
    }
    
    static int back() {
    	if(tail-head==0) {
    		return -1;
    	}else {
    		return dat[tail - 1];
    	}
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		// 명령어 개수 n
		int n = Integer.parseInt(br.readLine());
		while(n!=0) {
			
			// 명령어
			st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();
			
			if(command.equals("push")) {
				push(Integer.parseInt(st.nextToken()));
				
			}else if(command.equals("pop")) {
				sb.append(pop()).append('\n');
				
			}else if(command.equals("empty")) {
				sb.append(empty()).append('\n');
				
			}else if(command.equals("size")) {
				sb.append(size()).append('\n');
				
			}else if(command.equals("front")) {
				sb.append(front()).append('\n');
				
			}else {
				sb.append(back()).append('\n');
			}
			n--;
		}
		
		System.out.println(sb);
		
	}
}