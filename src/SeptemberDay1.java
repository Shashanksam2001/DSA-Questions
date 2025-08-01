public class SeptemberDay1 {
    public static void main(String[] args) {
        int[] arr={4,5,0,1,9,0,5,0};
// Output:
// 4 5 1 9 5 0 0 0
System.out.println(arr.length);
int index=0;
for (int i = 0; i < arr.length-1; i++) {
    
    if(arr[i]!=0){
        arr[index]=arr[i];
        index++;
    } 
}

while(index<arr.length-1){
        arr[index]=0;
        index++;

    }
for (int i : arr) {
    System.out.println(i);
}

    }
}
