// 1*2*3*4*17*18*19*20
// --5*6*7*14*15*16
// ----8*9*12*13
// ------10*11

import java.util.*;
public class pattern6 {
    public static void main(String[] args){
        int n = 4;
        int k = 1;
        int l = n*n+n+1;
        for(int i=0;i<n;i++){
            for(int j=0;j<2*i;j++){
                System.out.print("-");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(k+"*");   
                k++;
            }
            l = l - (n-i);
            int p = l;
            for(int j=0;j<n-i;j++){
                if(j==n-i-1){
                    System.out.print(p);
                    break;
                }
                System.out.print(p+"*"); 
                p++;
            }
            System.out.println();
        }
    }
}
