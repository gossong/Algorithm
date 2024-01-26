class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
        int[] answer = myString.substring(myString.length()-1).equals("x") ? new int[arr.length+1] : new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i].length();
        }
        return answer;
    }
}