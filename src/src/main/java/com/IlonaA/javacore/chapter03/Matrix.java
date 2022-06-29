package src.main.java.com.IlonaA.javacore.chapter03;

public class Matrix {
    public static void main(String[] args) {
        double m [][] ={
                {0*0,1*0,2*0,3*0},
                {0*1,1*1,2*1,3*1},
                {0*2,1*2,2*2,3*2},
                {0*3,1*3,2*3,3*3}
        };
        int i,j;
        for (i=0;i<m.length;i++){
            for (j=0;j<m.length;j++){
                System.out.print((m[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
