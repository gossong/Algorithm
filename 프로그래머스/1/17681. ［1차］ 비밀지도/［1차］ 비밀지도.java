import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            // 이진수로 변환
            String s1 = change(n, arr1[i]);
            String s2 = change(n, arr2[i]);
            String ans = "";
            // 한글자씩 비교
            for(int j = 0; j < n; j++){
                char c1 = s1.charAt(j);
                char c2 = s2.charAt(j);
                // 1일 경우 #
                if(c1=='1' || c2=='1'){
                    ans = ans + "#";
                }else{
                    ans = ans + " ";
                }
            }
            answer[i] = ans;
        }
        
        return answer;
    }
    
    // 이진수 변환
    private String change(int n, int num){
        String str = "";
        while(num!=0){
            str = num%2 + str;
            num /= 2;
        }
        while(str.length()!=n){
            str = "0" + str;
        }
        
        return str;
    }
}