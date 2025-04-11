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
//1 linear search n^2 2 count array n 3 sum n 4 xor of ele xor with xor of seq from 0 to n 5