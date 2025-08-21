import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t-->0){
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxlen=1;
        for(int i=0;i<n;i++){
            int mini=a[i],maxi=a[i];
        for(int j=i+1;j<n;j++){
            mini=Math.min(mini,a[j]);
            maxi=Math.max(maxi,a[j]);
               if(maxi-mini+1==j-i+1){
                maxlen=Math.max(maxi-mini+1,maxlen);
               }
            
        }
        }
        System.out.println(maxlen);
      }
    }
}
