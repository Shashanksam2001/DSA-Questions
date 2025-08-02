import java.util.*;;
public class SepDay1Slot2{
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String day=scan.nextLine();
    int days=scan.nextInt();
    int count=0;
    int rem=0;
    switch (day) {
        case "mon":
            if(days>=7){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "tue":
            if(days>=6){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "wed":
            if(days>=7){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "thu":
            if(days>=7){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "fri":
            if(days>=7){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "sat":
            if(days>=7){
                count=count+1;
                rem=days-6;
                count=count+rem/7;
            }
            System.out.println(count);
            break;
            case "sun":
                count=count+1;
                count=count+rem/7;
            
            System.out.println(count);
            break;
            
    
        default:
            break;
    }
   

}
}