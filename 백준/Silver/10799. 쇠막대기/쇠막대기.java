import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		
		int check = 0;
		int result = 0;
		
		for(int i = 0; i < read.length(); i++) {
			char c = read.charAt(i);;
			
			// 여는 괄호가 나오면 check +1
			if(read.charAt(i) == '(') {
				check++;
				
			// 닫는 괄호가 나오면 check -1
			}else {
				check--;
                
                // 레이저
				if(read.charAt(i-1) == '(') {
					result += check;
				}else {
					result++;
				}
			}
		}
		
		System.out.println(result);
		
	}
}