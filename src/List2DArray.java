import java.util.*;
public class List2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        List<List<Integer>> a=new ArrayList<>();
        a.add(Arrays.asList(1, 2, 3));
        a.add(Arrays.asList(4, 5, 6));
        a.add(Arrays.asList(7, 8, 9));
        for (int i = 0; i < a.size(); i++) {
            for(int j=0;j<a.get(i).size();j++){
                System.out.println(a.get(i).get(j));
            }
        }
        
    }
}
