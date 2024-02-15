import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int[] abs = new int[array.length];
        int min = 100;
        for(int i = 0; i < array.length; i++){
            abs[i] = Math.abs(n-array[i]);
            min = Math.min(abs[i], min);
        }
        int num = 0;
        for(int i = 0; i < abs.length; i++){
            if(abs[i]==min){
                num = i;
                break;
            }
        }
        return array[num];
    }
}