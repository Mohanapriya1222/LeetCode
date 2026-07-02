class Solution {
    public int smallestIndex(int[] nums) {
  for(int i=0;i<nums.length;i++){
            int sum=0;
            int temp=nums[i];

            while(temp>0){
                int last=temp%10;
                sum+=last;
                temp=temp/10;
            }
            
            if(i==sum){
                return i;
            }
        }

        return -1;
    }
}