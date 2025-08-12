class Solution {
    public boolean reorderedPowerOf2(int n) {
        String target = digitCount(n);
        for (int i = 0; i < 31; i++) {
            if (target.equals(digitCount(1 << i))) {
                return true;
            }
        }
        return false;
    }

    private String digitCount(int n) {
        char[] count = new char[10];
        while (n > 0) {
            count[n % 10]++;
            n /= 10;
        }
        return new String(count);
    }
}
