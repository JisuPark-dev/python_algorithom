class Solution {
    public int GCD(int a1,int a2,int r){
        while(a1 % a2 != 0) {
            r = a1 % a2;
            a1 = a2;
            a2 = r;
        }
        return a2;
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int a1 = (numer1*denom2)+(numer2*denom1);
        int a2 = (denom1 * denom2);
        int con = GCD(a1,a2,1);
        int[] answer = {(a1/con),(a2/con)};
        return answer;
    }
}