import java.util.*;
class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        String ans = "";
        for(String a : arr){
            ans = a + ans;
        }
        return Long.parseLong(ans);
    }
}