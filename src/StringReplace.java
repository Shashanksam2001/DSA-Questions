public class StringReplace {
    public static void main(String[] args) {
        String a="Mr john Smith";
        StringBuilder b=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==' '){
                b.append("%20");
            }else{
                b.append(a.charAt(i));
            }
        }
        System.out.println(b);
    }
}
