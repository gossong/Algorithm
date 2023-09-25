import java.util.Arrays;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];  // 정답
        int[] clear = new int[N];  // 스테이지 클리어
        int[] challenge = new int[N];  // 스테이지 도전자
        
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<N; j++){
                if(stages[i]==j+1){
                    clear[j]++;
                }
            }
        }
        
        for(int i=0; i<N; i++){
            if(i>0){
                challenge[i] = challenge[i-1] - clear[i-1];
            }else{
                challenge[i] = stages.length;
            }
        }
        
        // 실패율
        double [] fail = new double[N];
        for(int i=0; i<N; i++){
            fail[i] = (double)clear[i] / (double)challenge[i];
            answer[i] = i + 1;
        } 
        
        // 정렬
        double tempFail = 0;
        int tempAnswer = 0;
        for(int i=0; i<N; i++){
            for(int j=1; j<N-i; j++){
                if(fail[j-1]-fail[j]<0){
                    tempFail = fail[j-1];
                    fail[j-1] = fail[j];
                    fail[j] = tempFail;
                    
                    tempAnswer = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tempAnswer;
                }
            }
        }
        
        return answer;
    }
}