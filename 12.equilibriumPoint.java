class Solution {
    public static int findEquilibrium(int arr[]) {
        int sum=0,leftSum=0;
       for(int i:arr)sum+=i;
       for(int i=0;i<arr.length;i++){
           int rightSum=sum-leftSum-arr[i];
           if(leftSum==rightSum) return i;
           leftSum+=arr[i];
       }
       return -1;
    }
}
