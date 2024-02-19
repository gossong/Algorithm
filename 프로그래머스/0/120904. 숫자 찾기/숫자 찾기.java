class Solution {
    public int solution(int num, int k) {
        String str = num + "";
        int answer = str.indexOf(k+"") == -1 ? -1 : str.indexOf(k+"") + 1;
        return answer;
    }
}