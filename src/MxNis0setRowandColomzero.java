import java.util.HashMap;

public class MxNis0setRowandColomzero {
    public static void main(String[] args) {
        //Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0
       // Step 1:create a new 2d array of same input size and clone with inbuild function a.clone()
       // Step 2:Find the position of 0 in the given 2d array and store in HashMap like key int type and value String type i+"add"+j 
       // Step 3:retive the 
        int[][] a=new int[][]{
            {1,2,3},{4,0,6},{7,8,9}
        };
       int [][] b=a.clone();
       HashMap<Integer,String> ash=new HashMap<>();
       int count=0;
       for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length;j++){
            if(a[i][j]==0){
                ash.put(count, i+"add"+j);
                count++;
            }
        }
       }
       for(String val:ash.values()){
        String d=val;
        int intalvalue=d.charAt(0)-'0';
         int finalvalue=d.charAt(d.length()-1)-'0';

          for(int i=0;i<a.length;i++){
            b[intalvalue][i]=0;
            b[i][finalvalue]=0;
        }
       }
       for(int i=0;i<b.length;i++){
        for(int j=0;j<b.length;j++){
            System.out.print(b[i][j]+" ");
        }System.out.println();
       }

    }
}
// Optimized code
// public class ZeroMatrixOptimized {
//     public static void main(String[] args) {

//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 0, 6},
//             {7, 8, 9}
//         };

//         int m = matrix.length;
//         int n = matrix[0].length;

//         boolean[] row = new boolean[m];
//         boolean[] col = new boolean[n];

//         // Step 1: Mark rows and columns having zero
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 0) {
//                     row[i] = true;
//                     col[j] = true;
//                 }
//             }
//         }

//         // Step 2: Set matrix elements to zero
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (row[i] || col[j]) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         // Print result
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

