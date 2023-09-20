import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// LinkedList
		LinkedList<String> wordList = new LinkedList<String>();
		String word[] = br.readLine().split("");
		
		// 영어 소문자 String 저장
		for(String s:word) {
			wordList.add(s);
		}
		
		// 명령어 개수 int
		int n = Integer.parseInt(br.readLine());
		
		// 커서 위치 (시간 초과)
//		int cursor = word.length;
//		
//		while(n!=0) {
//			
//			// 명령어
//			String command[] = br.readLine().split(" ");
//			String firstCommand = command[0];
//			
//			if(firstCommand.equals("L")) {
//				if(cursor!=0) {
//					cursor--;
//				}
//			}else if(firstCommand.equals("D")) {
//				if(cursor!=wordList.size()) {
//					cursor++;
//				}
//			}else if(firstCommand.equals("B")) {
//				if(cursor!=0) {
//					cursor--;
//					wordList.remove(cursor);
//				}
//			}else{
//				wordList.add(cursor, command[1]);
//				cursor++;
//			}
//			n--;
//		}
		
		// ListIterator 사용 : 리스트를 양방향으로 탐색하는 listIterator
		ListIterator<String> iter = wordList.listIterator();
		
		// 커서 초기화 : 맨 뒤
		while(iter.hasNext()) {
			iter.next();
		}
		
		while(n!=0) {
			
			// 명령어
			String command[] = br.readLine().split(" ");
			String firstCommand = command[0];
			
			if(firstCommand.equals("L")) {
				if(iter.hasPrevious()) {
					iter.previous();
				}
			}else if(firstCommand.equals("D")) {
				if(iter.hasNext()) {
					iter.next();
				}
			}else if(firstCommand.equals("B")) {
				if(iter.hasPrevious()) {
					iter.previous();
					iter.remove();
				}
			}else{
				iter.add(command[1]);
			}
			n--;
		}
		
		System.out.println(String.join("", wordList));
	}
}