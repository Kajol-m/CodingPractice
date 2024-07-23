class Solution {
    public int reverse(int x) {
        long result = 0;//avoid overflow
        while (x != 0) {
            int rem = x % 10;
            result = result * 10 + rem;
            x = x / 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}
//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
