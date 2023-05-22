import java.util.Scanner;



public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String str;
        str = scanner.nextLine();
        int answer = 0;
        answer += Integer.parseInt(str);
        while(true){
            str = scanner.nextLine();
            if(str.equals("=")){
//                System.out.println("===");
                break;
            }else{
                if(str.equals("-")){
//                    System.out.println("---");
                    str = scanner.nextLine();
                    answer-= Integer.parseInt(str);
                }else if(str.equals("+")){
//                    System.out.println("+++");
                    str = scanner.nextLine();
//                    System.out.println(str);
                    answer+= Integer.parseInt(str);
                }else if(str.equals("*")){
//                    System.out.println("+++");
                    str = scanner.nextLine();
//                    System.out.println(str);
                    answer*= Integer.parseInt(str);
                }
                else if(str.equals("/")){
//                    System.out.println("+++");
                    str = scanner.nextLine();
//                    System.out.println(str);
                    answer/= Integer.parseInt(str);
                }
            }
        }

        System.out.println(answer);
    }
}
