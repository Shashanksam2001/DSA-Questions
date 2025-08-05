public class LongestPalindromeInArray {
    public static void main(String[] args) {
        String[] arr = {"madam", "racecar", "apple", "noon", "civic", "levelup"};
        Boolean[] check=IsPalindrome(arr);
        for (int i = 0; i < check.length; i++) {
            if(check[i]){
                System.out.println("Is Palindrome "+arr[i]);
            }else{
                System.out.println("Not a Palindrome "+arr[i]);
            }
        }
       
    }
    public static Boolean[] IsPalindrome(String[] arr){
        Boolean[] a=new Boolean[arr.length];
    
        for(int i=0;i<arr.length;i++){
            boolean status=false;
            for(int j=0;j<arr[i].length()/2;j++){
                if(arr[i].charAt(j)!=arr[i].charAt(arr[i].length()-j-1)){
                    status=false;
                }else{
                    status=true;
                }
            }
            a[i]=status;
        }
        return a;
       
    }
}
