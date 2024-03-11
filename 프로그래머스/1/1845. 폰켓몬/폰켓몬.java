import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int[] arr = new int[max];
        int cnt = 0;
        
        for(int n : nums){
            arr[n-1]++;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i]!=0){
                cnt++; // 0 아닌 갯수 세기
            }
        }
        int answer = nums.length/2 >= cnt ? cnt : nums.length/2;
        return answer;
    }
}