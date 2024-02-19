class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        int answer = str.indexOf(String.valueOf(k)) == -1 ? -1 : str.indexOf(k+"") + 1;
        return answer;
    }
}