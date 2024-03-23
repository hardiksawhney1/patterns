// 4444444
// 4333334
// 4322234
// 4321234
// 4322234
// 4333334
// 4444444

import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] arr = new int[2*n-1][2*n-1];
        int k = n;
        for(int i=0;i<n;i++){
            //upper row
            for(int j=i;j<2*n-1-i;j++){
                arr[i][j] = k;
            }
            //lower row
            for(int j=i;j<2*n-1-i;j++){
                arr[2*n-2-i][j] = k;
            }
            //left column
            for(int j=i;j<2*n-1-i;j++){
                arr[j][i] = k;
            }
            //right column
            for(int j=i;j<2*n-1-i;j++){
                arr[j][2*n-2-i] = k;
            }
            k--;
        }
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
