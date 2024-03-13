import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] arr = new boolean[n];
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int l : lost){ // 도난일 경우 true
            arr[l-1] = true;
        }
        for(int r : reserve){
            boolean isDup = false;
            for(int l : lost){
                if(r==l){ // 중복 제거
                    arr[l-1] = false;
                    isDup = true;
                }
            }
            if(!isDup){
                list.add(r);
            }
            
        }
        for(int i = 0; i < list.size(); i++){
            int r = list.get(i);
            if(r > 1 && arr[r-2]){ // 이전 학생 확인
                arr[r-2] = false;
            }
            else if(r < n && arr[r]){ // 이후 학생 확인
                arr[r] = false;
            }        
        }
        
        for(int i = 0; i < arr.length; i++){
            if(!arr[i]){
                answer++;
            }
        }
        return answer;
    }
}