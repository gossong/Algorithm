import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;
        // Deque 사용
        Deque<Character> deque = new ArrayDeque<Character>();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);;
			
			// 여는 괄호
			if(c == '(') {
                		deque.add(c);
				
			// 닫는 괄호
			}else {
				// deque이 비어있지 않으면서, 이전 '('일 경우 -> () 제거
				if(deque.size()>0 && deque.getLast() == '(') {
				    deque.remove();
				}else {
				    deque.add(c);
				}	
			}
		}
        
        // deque이 비어있을 경우, true
        if(deque.size()==0){
            answer = true;
        }
        
        return answer;
    }
}
