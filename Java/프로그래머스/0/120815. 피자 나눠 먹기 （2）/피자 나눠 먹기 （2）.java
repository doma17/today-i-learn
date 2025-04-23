class Solution {
    public int solution(int n) {
        int gcd = getGcd(n, 6);
        int lcm = (n * 6) / gcd;
        return lcm / 6;
    }

    private static int getGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return getGcd(b, a % b);
    }
}