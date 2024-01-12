class Solution {
    public int solution(int a, int b) {
        int aplusb = Integer.parseInt(""+a+b);
        int bplusa = Integer.parseInt(""+b+a);
        
        return aplusb >= bplusa ? aplusb : bplusa;
    }
}