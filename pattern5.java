// if n=6
// 1111112
// 3222222
// 3333334
// 5444444
// 5555556
// 7666666 
import java.util.*;
public class pattern5{
    public static void main(String[] args) {
        int n = 6;
        int k = 0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                k++;
                for(int j=0;j<n;j++){
                    System.out.print(k);
                }
                k++;
                System.out.print(k);
            }
            else{
                System.out.print(k+1);
                for(int j=0;j<n;j++){
                    System.out.print(k);
                }
            }
            System.out.println();
        }
    }
}