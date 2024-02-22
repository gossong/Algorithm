import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int negative = numbers[0] * numbers[1];
        int positive = numbers[numbers.length-1] * numbers[numbers.length-2];
        int answer = Math.max(positive, negative);
        return answer;
    }
}