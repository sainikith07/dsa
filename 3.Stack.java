
class Solution {
    static void reverse(Stack<Integer> st) {
        // code here
        int n=st.size();
        for(int i=0;i<n/2;i++){
            int temp=st.get(i);
            st.set(i,st.get(n-i-1));
            st.set(n-i-1,temp);
        }
    }
}
