class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        // for(int num = i; num <= j; num++){
        //     String number = String.valueOf(num);
        //     if(number.contains(String.valueOf(k))){
        //         for(int l = 0; l < number.length(); l++){
        //             if(number.substring(l,l+1).equals(String.valueOf(k))){
        //                 answer++;
        //             }
        //         }
        //     }
        // }
        for(int n = i; n <= j; n++){
            int num = n;
            while(num != 0){
                if(num % 10 == k){
                    answer++;
                }
                num /= 10;
            }
        }
        return answer;
    }
}