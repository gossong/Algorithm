import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=9; i>=0; i--){
            answer += n/((int)Math.pow(10,i));
            n = n%((int)Math.pow(10,i));
        }

        // 끝자리 부터 더하기
        // while(true){
        //     answer+=n%10;
        //     if(n<10)
        //         break;

        //     n=n/10;
        // }

        
        return answer;
    }
}
