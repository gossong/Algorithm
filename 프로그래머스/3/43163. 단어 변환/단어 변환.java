import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        if(!Arrays.asList(words).contains(target)){
            return 0;
        }
        
        int[] vis = new int[words.length];
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0; i < words.length; i++){
            if(diff(begin, words[i])){
                que.add(i);
                vis[i] = 1;
            }
        }
        
        while(!que.isEmpty()){
            int cur = que.poll();
            for(int i = 0; i < words.length; i++){
                if(target.equals(words[cur])){
                    answer = vis[cur];
                    break;
                }
                if(diff(words[cur], words[i]) && vis[i]==0){
                    que.add(i);
                    vis[i] = vis[cur] + 1;
                }
            }
        }
        
        return answer;
    }
    
    public boolean diff(String begin, String target){
        int d = 0;
        for(int i = 0; i < begin.length(); i++){
            if(begin.substring(i,i+1).equals(target.substring(i,i+1))){
                d++;
            }
        }
        if(begin.length()-1==d){
            return true;
        }
        return false;
    }
}