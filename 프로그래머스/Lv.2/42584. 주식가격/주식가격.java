class Solution {
    public int[] solution(int[] prices) {
	int length = prices.length;
        int[] answer = new int[length];

	// O(n^2)
	for (int i = 0; i < length; i++) {
		for (int j = i + 1; j < length; j++) {
			answer[i]++; 
			if (prices[i] > prices[j]) {
				break;
			}
		}
	}

	// Deque 활용
	Deque<Integer> deq = new ArrayDeque<>();
        
        for(int i = 0; i < length; i++){
            while(deq.size()>0 && prices[deq.peekLast()] > prices[i]){
                answer[deq.peekLast()] = i - deq.peekLast();  // 현재 주식 감소 시점 - 주식이 처음 들어간 시점
                deq.pollLast();
            }
            deq.add(i);
        }
        
        while(deq.size()>0){
            answer[deq.peekLast()] = length - deq.peekLast() - 1;
            deq.pollLast();
        }
	    	
	return answer;
    }
}
