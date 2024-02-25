class Solution {
    public String solution(String bin1, String bin2) {
        int int1 = Integer.parseInt(bin1, 2);
        int int2 = Integer.parseInt(bin2, 2);
        String answer = Integer.toBinaryString(int1+int2);
        return answer;
    }
}