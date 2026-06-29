class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int sumof=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            sumof += digitofarray(nums[i]);
        }
        return Math.abs(sum-sumof);
        }
    static int digitofarray(int n){
        int div=1;
            int sumof=0;
            while(div<=n){
                int digit=n%(div*10)/div;
                sumof += digit;
                div*=10;
            }
            return sumof;
            }
}
