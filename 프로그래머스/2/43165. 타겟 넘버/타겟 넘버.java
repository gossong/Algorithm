import java.util.*;
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        list.add(0);
        while(count<numbers.length){
            list = func(list, numbers[count++]);
        }
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).intValue()==target){
                answer++;
            }
        }
        return answer;
    }
    
    public static List<Integer> func(List<Integer> list, int b){
        List<Integer> newList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            newList.add(list.get(i).intValue()+b);
            newList.add(list.get(i).intValue()-b);
        }
        return newList;
    }
}