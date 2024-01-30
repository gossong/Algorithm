import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        BigInteger inta = new BigInteger(a);
        BigInteger intb = new BigInteger(b);
        BigInteger sum = inta.add(intb);
        String answer = sum.toString();
        return answer;
    }
}