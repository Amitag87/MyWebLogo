import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of row");
        int row = sc.nextInt();
        System.out.println("input size of column");
        int col =sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sum = new int[row][col];
        for(int i=0 ;i<arr1.length;i++){
            System.out.println("enter elements for " + i + " row");
            for(int j=0; j<arr1[i].length;j++){
                arr1[i][j]= sc.nextInt();
            }
        }
        for(int i=0 ;i<arr2.length;i++){
            System.out.println("enter elements for " + i + " row");
            for(int j=0; j<arr2[i].length;j++){
                arr2[i][j]= sc.nextInt();
            }
        }

        add(arr1,arr2,sum);
       // System.out.println("sum of array is:" + sum);
    }

    public static void add(int[][] arr1 , int[][] arr2 , int[][] sum) {
        for(int i=0 ; i<arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] =arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
