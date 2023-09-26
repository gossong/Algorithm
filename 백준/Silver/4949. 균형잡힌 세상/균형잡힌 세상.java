import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Character> que = new ArrayDeque<>();
		
		char temp;
		
		while(true) {
			que.clear();  // que 초기화
			
			String line = br.readLine();
			
			if(line.equals(".")) {
				break;
			}
			
			for(int i = 0; i < line.length(); i++) {
				temp = line.charAt(i);
				
				// 여는 괄호가 나오면 스택에 추가
				if(temp == '[' || temp == '(') {
					que.push(temp);
					
				// 닫는 괄호가 나왔을 경우,
				}else if(temp == ']' || temp == ')') {
					// 스택이 비어있거나, 짝이 맞지 않는 괄호일 경우, 올바르지 않은 괄호 쌍
					if (que.isEmpty() || (que.peek() == '(' && temp == ']') || (que.peek() == '[' && temp == ')')) {
						que.push(temp);
						break;
					}
					// 스택의 top이 짝이 맞는 괄호일 경우, pop
					que.pop();
				}
			}
			
			if(!que.isEmpty()) {
				System.out.println("no");
			}else {
				System.out.println("yes");
			}
			
		}
		
		
	}
}