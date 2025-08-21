import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args)throws IOException {
       
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           
            long x1=sc.nextLong();
            long y1=sc.nextLong();
           long x2=sc.nextLong();
            long y2=sc.nextLong();
            long x3=sc.nextLong();
            long y3=sc.nextLong();
            System.out.println((x2-x1)*(y3-y1)==(y2-y1)*(x3-x1)?"Yes":"No");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    }
}
