class Solution {
    public long solution(String numbers) {
        String[] num_string = new String[]{"zero","one","two","three","four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i<num_string.length; i++){
            String str = i+"";
            numbers = numbers.replaceAll(num_string[i], str);    
        }
        
        return Long.parseLong(numbers);
    }
}