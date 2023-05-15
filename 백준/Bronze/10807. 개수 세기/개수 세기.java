import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        int[] arr = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        int cnt = 0;
        for(int i: arr){
            if(i == x)cnt++;
        }
        System.out.println(cnt);
    }
}