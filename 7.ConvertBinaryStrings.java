import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            String m=sc.next();
            if(m.equals(n)){
                System.out.println("YES 0");
                continue;
            }
            int c01=0,c10=0,st0=0,st1=0;
            for(int i=0;i<n.length();i++){
                char a=n.charAt(i),b=m.charAt(i);
                if (a=='0')st0++;
                else st1++;
                if(a=='0'&& b=='1') c01++;
                else if(a=='1'&&b=='0')c10++;
            }
          
            if(st0==0||st1==0)System.out.println("NO");
            else if(c01>c10) System.out.println("YES "+Math.max(c01,c10));
            else System.out.println("YES "+Math.max(c01,c10));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
    
}
