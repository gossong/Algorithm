import java.util.*;

class Solution {
    static boolean[] visited;
    static ArrayList<String> list;
    static int cnt;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>(); // 경로 전부 추가
        cnt = 0;
        dfs("ICN", "ICN", tickets, cnt);
        
        Collections.sort(list);
        String[] answer = list.get(0).split(" ");
        return answer;
    }
    
    public static void dfs(String start, String route, String[][] tickets, int cnt){
        if(cnt == tickets.length){
            list.add(route);
            return;
        }
        for(int i = 0; i < tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, cnt+1);
                visited[i] = false;
            }
        }
    }
}