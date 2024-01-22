public class TabD2App1 {
    public static  void main(String[] args){
        int [][] mat = new int[2][3] ;

        mat[0][0] = 1 ;
        mat[0][1] = 1 ;
        mat[0][2] = 1 ;


        mat[1][0] = 2 ;
        mat[1][1] = 2;
        mat[1][2] = 2 ;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j <mat[i].length ; j++) {
                System.out.println("i >>is : " + i + " j >> is : " + j + " " + mat[i][j]);
            }
        }

        for ( int[] tab1: mat){
                for( int tab2 : tab1){
                    System.out.println(tab2 + " ");
                }
        }
    }
}
