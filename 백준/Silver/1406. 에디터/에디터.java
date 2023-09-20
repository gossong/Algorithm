import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
	
	static final int MX = 1000005;
    static char[] dat = new char[MX];  // 현재 인덱스
    static int[] pre = new int[MX];    // 이전 인덱스
    static int[] nxt = new int[MX];    // 다음 인덱스
    static int unused = 1;  // 현재 사용되지 않는 인덱스
    
	static void insert(int addr, char num) {
		dat[unused] = num;
		pre[unused] = addr;
		nxt[unused] = nxt[addr];
		if(nxt[addr] != -1)
			pre[nxt[addr]] = unused;
		nxt[addr] = unused;
		unused++;
	}
	
	static void erase(int addr) {
		nxt[pre[addr]] = nxt[addr];
		if(nxt[addr] != -1)
			pre[nxt[addr]] = pre[addr];
	}
	
	static StringBuilder traverse(StringBuilder sb){
		int cur = nxt[0];  
		while(cur != -1){  
			sb.append(dat[cur]);
			cur = nxt[cur];
		}
		return sb;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 배열 초기화
		Arrays.fill(pre, -1);
		Arrays.fill(nxt, -1);
		
		String input = br.readLine();
		
		// cursor
	    int cursor;
	    for (cursor = 0; cursor < input.length();) {
	    	insert(cursor, input.charAt(cursor));
	        cursor++;
	    }
		
		// 명령어 개수 int
		int n = Integer.parseInt(br.readLine());
		while(n!=0) {
			
			// 명령어
			String command[] = br.readLine().split(" ");
			String firstCommand = command[0];
			
			if(firstCommand.equals("L")) {
				if(pre[cursor] != -1) {
					cursor = pre[cursor];
				}
			}else if(firstCommand.equals("D")) {
				if(nxt[cursor] != -1) {
					cursor = nxt[cursor];
				}
			}else if(firstCommand.equals("B")) {
				if(pre[cursor] != -1) {
					erase(cursor);
					cursor = pre[cursor];
				}
			}else{
				char ch = command[1].charAt(0);
				insert(cursor, ch);
				cursor = nxt[cursor];
			}
			n--;
		}
		
		System.out.println(traverse(sb));
		
		
	}
}