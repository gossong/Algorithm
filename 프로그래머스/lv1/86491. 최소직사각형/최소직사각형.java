class Solution {
    public int solution(int[][] sizes) {
        int w = 0; // 가로
        int h = 0; // 세로
        
        for(int i=0; i < sizes.length; i++){
        	if(sizes[i][0]>sizes[i][1]) {
        		int c = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = c;
        	}
        	
        	if(w < sizes[i][0]){
                w = sizes[i][0];
            }
            if(h < sizes[i][1]){
            	h = sizes[i][1];
            }
        }
        
        return w * h;
    }
}