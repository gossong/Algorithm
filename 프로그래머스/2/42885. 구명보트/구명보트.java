import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);  // 오름차순으로 정렬

        int check = 0;
        int j = 0;
        for(int i = people.length-1; i >= j; i--){
            if(people[i]+people[j]<=limit){
                j++;
            }
            check++;
        }
        
        return check;
    }
}
