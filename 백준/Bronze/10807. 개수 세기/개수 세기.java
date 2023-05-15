import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        int[] arr = new int[n];
        for(int i =0;i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        for(int i =0; i<n; i++){
            if(map1.get(arr[i]) == null){
                map1.put(arr[i], 1);
            }else{
                map1.put(arr[i],map1.get(arr[i])+1);
            }
        }

        if(map1.get(x) == null){
            System.out.println("0");
        }else{
            System.out.println(map1.get(x));
        }
    }
}