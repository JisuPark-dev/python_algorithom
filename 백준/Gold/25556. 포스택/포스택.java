import java.util.Stack;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        String str_tmp;
        String[] str = {};
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();
        int result = 1;
        
        n = Integer.parseInt(sc.nextLine());
        str_tmp = sc.nextLine();
        str = str_tmp.split(" ");
        
        for(int i =0; i< n; i++){
            if(stack1.empty()||stack1.peek()<Integer.parseInt(str[i])){
                stack1.push(Integer.parseInt(str[i]));
            }else if(stack2.empty()||stack2.peek()<Integer.parseInt(str[i])){
                stack2.push(Integer.parseInt(str[i]));
            }else if(stack3.empty()||stack3.peek()<Integer.parseInt(str[i])){
                stack3.push(Integer.parseInt(str[i]));
            }else if(stack4.empty()||stack4.peek()<Integer.parseInt(str[i])){
                stack4.push(Integer.parseInt(str[i]));
            }else{
                result = 0;
            } 
        }
        if(result == 0){
           System.out.println("NO");            
        }else{
            System.out.println("YES");
        }

    }
}