class Solution {
    public int solution(String s) {
        int number=0;
        try{
            number = Integer.valueOf(s);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return number;
    }
}