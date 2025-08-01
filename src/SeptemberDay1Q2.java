public class SeptemberDay1Q2 {
    public static void main(String[] args) {
        //Converting the number to Binary and then transpose and convert to number
        int a=10;
        char[] c=new char[7];
        String b="";
            while (a>0) {
                b=a%2+b;
                a=a/2;
        }
        System.out.println(b);
        String d="";
        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i)=='0'){
               d=d+'1';
            }else{
                d=d+'0';
            }

        }
        System.out.println(d);
        int temp=0;
        for(int i=0;i<d.length();i++){
            if(d.charAt(i)=='0'){
                temp=(int)Math.pow(2, i)+temp;
            }
        }
        System.out.println(temp);
    }
    
}
