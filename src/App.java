import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       
        int target=10;
        int[] a={6,3,9,7,2,1};//Two Sum
        int[] b={7,1,2,4,1,7,9}; //Buy and Sell Stocks
        int[] c={2,3,1,2,3,4,5,};
        //merge the sorted arr
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        int[] arr=towSum(target,a);
        System.out.println(Arrays.toString(arr));
        System.out.println(sellStocks(b));
        sortedarray(arr1);
        System.out.println(SortedArray(arr1, arr2));
        BubbleSort(arr1);
        System.out.println(BubbleSort(arr1));
        SelectionSort(a);
        Count(c);
        for(int ar:a){
            System.out.println("Selection"+ar);
        }
        fact(5);
        int n=15;
        fun(n-3);
        
    }
    public static void fun(int n){
         
    }
    public static void fact(int n){
        int res=1;
        for(int i=1;i<=5;i++){
            res=res*i;
        }
        
        
    }
  
   
    

    public static void Count(int[] c){
        int n=c.length;
        boolean[] a=new boolean[n];
        for(int i=0;i<n;i++){
            if(a[i]){
                continue;
            }
            int Count=1;
            for(int j=i+1;j<n;j++){
                if(c[i]==c[j]){
                    a[j]=true;
                    Count++;
                }
            }
            System.out.println(c[i] + " -> " + Count + " times");

        }
    }

    public static void SelectionSort(int[] a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
         
     public static int[] towSum(int target,int[] a){
        for(int i=0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[i]+a[j]==target){
                return new int[]{a[i],a[j]};
            }
        }
    }
            return null;

     }
     public static int sellStocks(int[] b){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int arr: b){
            if(arr<min){
                min=arr;
            }else{
                profit=Math.max(profit,arr-min);
            }
        }

        return profit;
     } 
    
     public static void sortedarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
     }
    public static StringBuilder SortedArray(int[] arr1,int[] arr2){
        StringBuilder a =new StringBuilder();
        sortedarray(arr1);
        sortedarray(arr2);
        for(int i=0;i<arr1.length;i++){
            a=a.append(arr1[i]);
            a=a.append(arr2[i]);
        }
        
        return a;

        
    }

    public static String BubbleSort(int[] a){
        boolean swap=false;
        String ab="";
        for(int i=0;i<a.length;i++){
            swap=false;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap) 
            ab="Array is sorted";
            break;
        }
        return ab;
    }
    
    
}
