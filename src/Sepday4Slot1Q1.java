import java.util.*;
public class Sepday4Slot1Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr=new int[N];
        
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the element of index"+i);
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter the Date:");
        int date=scan.nextInt();
        System.out.println("Enter the Fine:");
        int fine=scan.nextInt();
        int count=0;
        
        for (int i = 0; i < arr.length; i++) {
            if(date%2==0){
                if(arr[i]%2!=0){
                    count++;
                }
            }
            if(date%2!=0){
                if(arr[i]%2==0){
                    count++;
                }
            }
        }
        System.out.println(fine*count);
        

    }
}
