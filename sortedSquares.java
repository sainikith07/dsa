class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1,pos=n-1;
        int[] a=new int[n];
        while(l<=r){
            int ls=nums[l]*nums[l];
            int rs=nums[r]*nums[r];
            if(ls>rs){
                a[pos]=ls;
                l++;
            }
            else{
                a[pos]=rs;
                r--;
            }
            pos--;
        }
        return a;
    }
}