import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }


        int max = Integer.valueOf(arr[0]);
        int min = Integer.valueOf(arr[0]);
        for(int i =0; i< arr.length; i++){
            if(max<Integer.valueOf(arr[i])){
                max = Integer.valueOf(arr[i]);
            }
            if(min > Integer.valueOf(arr[i])){
                min = Integer.valueOf(arr[i]);
            }
        }
        System.out.println(min+ " "+max);
    }
}