import java.util.Arrays;

public class prettyFormatter {
  public static void main(String[] args) {
    // float a=312312.1234567f;
    // int b=21321;
    // System.out.printf("%.3f",a);
    // System.out.printf("Hello my name is %s my age is %d","Shashank",24);
    // System.out.printf("%1d",b);
    String a="12321";
    StringBuilder c=new StringBuilder();
    c.reverse().append(a);
    boolean b;
    for (int i = 0; i < a.length(); i++) {
      if(c.charAt(i)!=a.charAt(i)){
        b= false;
      }b=true;
    }
    if(b=true){
      System.out.println("Palindrome");
    }else{
      System.out.println("not Palindrome");
    }
    System.out.println(Arrays.toString(a.toCharArray()));
  }
}
