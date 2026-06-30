class Solution {
    public int getLucky(String s, int k) {
         String str = "";

        for (int i = 0; i < s.length(); i++) {
            str += (s.charAt(i) - 'a' + 1);
        }

        while (k > 0) {
            int sum = 0;

            for (int i = 0; i < str.length(); i++) {
                sum += str.charAt(i) - '0';
            }

            str = String.valueOf(sum);
            k--;
        }

        return Integer.parseInt(str);
    }
}