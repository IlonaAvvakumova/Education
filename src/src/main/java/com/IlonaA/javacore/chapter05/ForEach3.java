package src.main.java.com.IlonaA.javacore.chapter05;

public class ForEach3 {
    public static void main(String[] args) {
        int sum=0;
        int nums[][] = new int[3][5];
        for (int i = 0; i < 3; i++) {//присвоить значения элементам массива
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i+1)*(j+1);
            }
        }
        for(int x[]:nums){
            for(int y:x){
                System.out.println("Znschenie ravno: " +y);
                sum+=y;
            }
        }
        System.out.println("Summa: " +sum);
    }
}
