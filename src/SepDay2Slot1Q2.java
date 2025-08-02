public class SepDay2Slot1Q2 {
    public static void main(String[] args) {
        int n=5244;
        int rem=0;
        int product=1;
        while(n>0){
            rem=n%10;
            product=product*rem;
            n=n/10;
        }
        System.out.println(product);
    }
}
