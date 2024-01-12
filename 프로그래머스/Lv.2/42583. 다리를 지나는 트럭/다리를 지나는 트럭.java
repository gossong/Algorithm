import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> que = new ArrayDeque<>();
        int sum = 0;
        int time = 0;
        
        for(int truck : truck_weights){
            while(true){ // 다리에 트럭 추가
                if(que.size()==0){ // 다리에 트럭 없는 경우
                    que.add(truck);
                    time++; 
                    sum += truck;
                    break;
                }else if(que.size() == bridge_length){ // 다리에 트럭 다 차있는 경우
                    int remove_truck = que.poll();
                    time++;
                    sum -= remove_truck;
                    if(sum + truck <= weight){ // weight보다 작을 경우, 새 트럭 추가
                        que.add(truck);
                        sum += truck;
                        break;
                    }else{ // weight보다 클 경우, 빈 공간 추가
                        que.add(0);
                    }
                }else{ // 다리에 자리가 있을 경우
                    time++;
                    if(sum + truck <= weight){
                        que.add(truck);
                        sum += truck;
                        break;
                    }else{
                        que.add(0);
                    }
                }
            }
        }
        
        return time + bridge_length;
    }
}