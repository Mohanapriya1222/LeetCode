class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        for(String str:s){
         String st[]= str.split(" ");
         int len=st.length;
         max=Math.max(max,len);
    }
    return max;
}
}