class Solution {
    public int isPrime(int n) {
        if(n ==2 || n==3)return 1;
	    for (int i = 2; i<=(int)Math.sqrt(n)+1; i++) {
            if (n % i == 0) {
                return 0;
            }
	    }
	    return 1;
    }
    
    public int solution(int a, int b) {
        int answer = 0;
        int max = 0;
        for( int i =1; i<=a&& i<=b; i++){
            if (a%i ==0 && b%i==0){
                max = i;
            }
        }
        if(max!=0){
            a = a/max;
            b = b/max;
        } 
        for(int i =3; i<=1000; i++){
            if (isPrime(i)==1&&i!=5){
                if(b%i==0){
                    answer = 2;
                    System.out.println("???"+i);
                    break;
                }      
            }else{
                    answer=1;
            }
        }
        return answer;
    }
}