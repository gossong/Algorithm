import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> s = new Stack<Integer>();
        
        for(int i : ingredient){
            s.push(i);
            
            // stack의 크기가 4 이상
            if(s.size() >= 4){
                
                // stack의 마지막이 1, 3, 2, 1 순일 때
                if(s.get(s.size()-1)==1
                  && s.get(s.size()-2)==3
                  && s.get(s.size()-3)==2
                  && s.get(s.size()-4)==1){
                    answer++;
                    // 1,3,2,1 제거
                    s.pop(); s.pop(); s.pop(); s.pop();
                }
            }
        }
        
        return answer;
    }
}