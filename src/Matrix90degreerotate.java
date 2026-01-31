import java.util.Scanner;

public class Matrix90degreerotate {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Enter the length of the matrix N x N=");
        int N=scan.nextInt();
        int[][] a=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.println("enter the value of"+i+j+ "index");
                 a[i][j]=scan.nextInt();
            }
        }
        int[][] b=new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                b[i][j]=a[N-1-j][i];
            }
        }
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(b[i][j]+" ");
              
            }
              System.out.println();
        }
    }
}
