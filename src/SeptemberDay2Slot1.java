public class SeptemberDay2Slot1 {
    public static void main(String[] args) {
        int[] arr={3,4,5,8,9};
        int c=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[0]<arr[i]){
                c++;
            }
        }
        System.out.println(c);
    }
}
