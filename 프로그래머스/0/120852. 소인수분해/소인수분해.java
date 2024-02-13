import java.util.*;
class Solution {
    public int[] solution(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int num = 2;
        while(n>1){
            if(n%num==0){
                n = n/num;
                set.add(num);
            }else{
                num++;
            }
        }
        int[] answer = set.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);
        return answer;
    }
}