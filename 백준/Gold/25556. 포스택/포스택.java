import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        int n;
        String str_tmp;
        String[] str = {};
        
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());
        str_tmp = scanner.nextLine();
        str = str_tmp.split(" ");
        
        String result = "YES";
        
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        
        for(int i =0; i<n; i++){
            if(stack1.empty()||stack1.peek()<Integer.parseInt(str[i])){
                stack1.push(Integer.parseInt(str[i]));
            }else if(stack2.empty()||stack2.peek()<Integer.parseInt(str[i])){
                stack2.push(Integer.parseInt(str[i]));
            }else if(stack3.empty()||stack3.peek()<Integer.parseInt(str[i])){
                stack3.push(Integer.parseInt(str[i]));
            }else if(stack4.empty()||stack4.peek()<Integer.parseInt(str[i])){
                stack4.push(Integer.parseInt(str[i]));
            }else{
                result = "NO";
            }
        }
        System.out.println(result);
    }
}