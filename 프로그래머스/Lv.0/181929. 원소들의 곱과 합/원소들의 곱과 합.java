class Solution {
    public int solution(int[] num_list) {
        int a = num_list[0]; // 곱
        int b = num_list[0]; // 합의 제곱
        for(int i = 1; i < num_list.length; i++){
            a *= num_list[i];
            b += num_list[i];
        }
        b = b*b;
        if(a < b){
            return 1;
        }else{
            return 0;
        }
    }
}