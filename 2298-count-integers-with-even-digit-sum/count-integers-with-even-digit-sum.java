class Solution {
    public int countEven(int n) {
        int count=0;
        for(int i=1;i<=n; i++){
             int sum=0;
      int div =i;
       while(div>0){
        sum=sum+(div%10);
        div=div/10;
       }
       if(sum%2==0){
        count++;
       }
        }
        return count;
    }
}