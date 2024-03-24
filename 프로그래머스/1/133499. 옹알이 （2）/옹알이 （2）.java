class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            b = b.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            b = b.replaceAll("aya|ye|woo|ma", "");
            if (b.equals(""))
                answer++;
        }
        return answer;
    }
}