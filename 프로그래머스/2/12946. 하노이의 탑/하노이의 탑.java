import java.util.*;
class Solution {
    static ArrayList<int[]> list;
    public int[][] solution(int n) {
        list = new ArrayList<>();
        func(1, 3, n);
        
        int[][] answer = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            answer[i][0] = list.get(i)[0];
            answer[i][1] = list.get(i)[1];
        }
        return answer;
    }
    
    public static void func(int a, int b, int n){
        int[] move = {a,b};
        if(n==1){
            list.add(move);
            return;
        }
        func(a, 6-a-b, n-1);
        list.add(move);
        func(6-a-b, b, n-1);
    }
}