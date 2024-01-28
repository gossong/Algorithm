class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        int suma = 0;
        int sumb = 0;
        if(a!=b){
            answer = a > b ? 1 : -1;
        }else{
            for(int i = 0; i < a; i++){
                suma += arr1[i];
                sumb += arr2[i];
            }
            answer = suma == sumb ? 0 : suma > sumb ? 1 : -1;
        }
        return answer;
    }
}