public class MatrixMultiplication{
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{5,6},{7,8}};
        int[][] c = new int[2][2];
        for(int row=0;row<2;row++){
            for(int col=0;col<2;col++){
                /*c[row][col] = 0;
                for(int k=0;k<2;k++){
                    c[row][k] += a[row][k]+b[k][col];
                }*/
               c[row][col] = a[row][col]+b[row][col];
                System.out.print(c[row][col]+" ");
            }
            System.out.println("");
        }
    }
}