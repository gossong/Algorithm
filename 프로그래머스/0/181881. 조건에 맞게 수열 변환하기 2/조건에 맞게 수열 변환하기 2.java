import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] temp = new int[arr.length];
        boolean check = false;
        while(!check){
            if(Arrays.equals(arr, temp)){
                check = true;
            }else{
                temp = Arrays.copyOf(arr, arr.length);
                for(int i = 0; i < arr.length; i++){
                    if(arr[i]>=50&&arr[i]%2==0){
                        arr[i] = arr[i]/2;
                    }else if(arr[i]<50&&arr[i]%2!=0){
                        arr[i] = arr[i]*2+1;
                    }
                }
                answer++;
            }
        }
        return answer-1;
    }
}