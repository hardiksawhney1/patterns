// 1
// 3*2
// 4*5*6
// 10*9*8*7
// 11*12*13*14*15
import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            if(i%2==0){                  //reverse
                k+=i-1;
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(k);
                        k--;
                    }
                }
                k=k+i+1;
            }
            else{
                
                for(int j=1;j<=2*i-1;j++){
                    if(j%2==0){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(k);
                        k++;
                    }
                }
            }
            System.out.println();
        }
    }
}
