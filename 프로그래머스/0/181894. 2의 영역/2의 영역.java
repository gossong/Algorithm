import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==2){
                list.add(i);
            }
        }
        
        int[] answer = {};
        if(list.size()==0){
            answer = new int[1];
            answer[0] = -1;
        }
        else if(list.size()==1){
            answer = new int[1];
            answer[0] = 2;
        }
        else{
            int size = list.get(list.size()-1) - list.get(0) + 1;
            answer = new int[size];
            int num = list.get(0);
            for(int i = 0; i < size; i++){
                answer[i] = arr[num++];
            }
        }

        return answer;
    }
}