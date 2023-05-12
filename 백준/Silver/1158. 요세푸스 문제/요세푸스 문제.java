import java.util.Scanner;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //입력 받기
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        LinkedList<Integer> arr = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i =1; i<=n; i++ ){
            arr.add(i);
        }


        System.out.print("<");
        int number = 1; // 3
        while(arr.size()!=1){//arr원소가 다 빌때까지 반복
            //number가 k로 나누어 떨어지는 숫자면 빼서, answer에 담는다, 아니면 제일 뒤로 넘긴다.
            if(number%k ==0){
                int tmp = arr.pollFirst();
                answer.add(tmp);
                System.out.print(tmp+", ");
            }else{
                int tmp = arr.pollFirst();
                arr.addLast(tmp);
            }
            number++;
        }
        System.out.print(arr.poll()+">");
    }
}