public class StringCompression {
    public static void main(String[] args) {
            String a="aaabbc";
        StringBuilder b=new StringBuilder();
        int count=1;
        for(int i=0;i<a.length();i++){
            if((i<a.length()-1) && a.charAt(i)==(a.charAt(i+1))  ){
                count++;
                }else{
                if(count>1){
                    b.append(a.charAt(i)).append(count);
                }else{
                    b.append(a.charAt(i));
                }
                count=1;
            }
        }System.out.println(b);
    }
}
