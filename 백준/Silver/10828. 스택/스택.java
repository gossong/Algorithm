import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static final int MX = 1000005;
    static int[] dat = new int[MX];
    static int size = 0;
    
    static void push(int x){
    	dat[size] = x;
    	size++;
    }
    
    static int pop() {
    	if(size == 0) {
    		return -1;
    	}else {
    		int del = dat[size - 1]; // 제거할 스택
			dat[size - 1] = 0;  // 스택에 0으로 초기화
			size--;
			return del;
    	}
    	
    }
    
    static int top() {
    	if(size == 0) {
			return -1;
		}
		else {
			return dat[size - 1];
		}
    }
    
    static int size() {
    	return size;
    }
    
    static int empty() {
    	if(size == 0) {
    		return 1;
    	}
    	return 0;
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
				
			}else if(command.equals("top")) {
				sb.append(top()).append('\n');
				
			}else if(command.equals("size")) {
				sb.append(size()).append('\n');
				
			}else {
				sb.append(empty()).append('\n');
			}
			n--;
		}
		
		System.out.println(sb);
		
	}
}