class Solution {
    public int missingNumber(int[] a) {
        int i=0;
        for(i=0;i<a.length;i++){
            int f=0;
            for(int n:a){
                if(i==n){
                    f=1;
                    break;
                }
            }
            if(f==0){
                return i;
            }
        }
        return i;
    }
}
