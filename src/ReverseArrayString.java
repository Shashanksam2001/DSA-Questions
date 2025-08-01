public class ReverseArrayString {
    public static void main(String[] args) {
        String[] a=new String[]{"hi","this","is","shashank"};
       for (int i = 0; i < a.length; i++) {
        String b="";
        for(int j=a[i].length()-1;j>=0;j--){
            b=b+a[i].charAt(j);
        }
        System.out.println(b+"Done");
       }
       int[] c=new int[]{1011,1023,9800};
       for (int i = 0; i < c.length; i++) {
        int temp=c[i];
        int temp1=0;
        int rem;
        while(temp>0){
            rem=temp%10;
            temp1=temp1*10+rem;
            temp=temp/10;

        }
        c[i]=temp1;
        System.out.println(c[i]);
       }
    }
    
}
