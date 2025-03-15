class Solution {
    public int missingNumber(int[] a) {
        int n1=0,n2=0;
        int n=a.length;
       n2=(n*(n+1))/2;
        for(int i=0;i<a.length;i++){
            n1+=a[i];
        }
        return n2-n1!=0?n2-n1:n+1;
    }
}