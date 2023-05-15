import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        Loop1:
        for(int i = 0; i< n; i++){
            String str = scanner.nextLine();
            ArrayList list = new ArrayList();
            Loop2:
            for(int j = 0; j<str.length(); j++){
                if(list.size() == 0){
                    if(str.charAt(j) == ')'){
                        System.out.println("NO");
                        continue Loop1;
                    }else{
                        list.add("(");
                    }
                }else{
                    if(str.charAt(j)== ')'){
                        list.remove(list.size()-1);
                    }else{
                        list.add("(");
                    }
                }
            }
            if(list.size() == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}