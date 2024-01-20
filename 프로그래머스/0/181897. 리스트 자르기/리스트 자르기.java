import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int[] answer = {};
        if(n==1) answer = Arrays.copyOfRange(num_list, 0, b+1);
        if(n==2) answer = Arrays.copyOfRange(num_list, a, num_list.length);
        if(n==3) answer = Arrays.copyOfRange(num_list, a, b+1);
        if(n==4) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = a; i <= b; i+=c){
                list.add(num_list[i]);
            }
            answer = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i).intValue();
            }
        }
        return answer;
    }
}