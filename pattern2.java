import java.util.*;
//Pascal Triangle

// ----1----
// ---1-1---
// --1-2-1--
// -1-3-3-1-
// 1-4-6-4-1 

public class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        int[][] arr = new int[n][2*n-1];
        //no need to initialize 2D array with 0 as it is already
        //initalized with zero as every element

        if(n>=1){
            arr[0][n-1] = 1;
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(j==0){
                    arr[i][j] = arr[i-1][j+1];
                }
                else if(j==2*n-2){
                    arr[i][j] = arr[i-1][j-1];
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j+1];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<2*n-1;j++){
                if(arr[i][j]!=0){
                    System.out.print(arr[i][j]);
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }


    }
}
