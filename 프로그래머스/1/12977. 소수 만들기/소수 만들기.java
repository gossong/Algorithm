import java.util.*;
class Solution {
    static ArrayList<Integer> list;
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] visited = new boolean[nums.length];
        list = new ArrayList<>();
        
        func(nums, visited, 0, 3); // nums.length 개중에 3개 뽑음
        for(int i = 0; i < list.size(); i++){
            if(isPrime(list.get(i))){
                answer++;
            }
        }
        return answer;
    }

    // 재귀 이용해서 구현
    static void func(int[] arr, boolean[] visited, int depth, int r) {
        int sum = 0;
        if(r == 0) {
            for(int i = 0; i < arr.length; i++) {
                if(visited[i] == true){
                    sum += arr[i];
                }
            }
            list.add(sum);
            return;
        }
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            func(arr, visited, depth + 1, r - 1);
 
            visited[depth] = false;
            func(arr, visited, depth + 1, r);
        }
    }
    
    // 소수 판별
    static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            } 
        }
        return true;
    }
}