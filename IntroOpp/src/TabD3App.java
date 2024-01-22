public class TabD3App {
    public static void main(String[] args){
        int [][][] mat3d = new int[2][2][3] ;

        // init element with a loop

        for (int i = 0; i < mat3d.length; i++) {
            for (int j = 0; j < mat3d[i].length; j++) {
                for (int k = 0; k < mat3d[j].length; k++) {
                        mat3d[i][j][k] = i + j ;
                }
            }
        }


        for(int[][]  mat2d:mat3d ){
            for ( int[] mat1d : mat2d){
                for(int n : mat1d){
                    System.out.println(n);
                }
            }
        }


    }
}
