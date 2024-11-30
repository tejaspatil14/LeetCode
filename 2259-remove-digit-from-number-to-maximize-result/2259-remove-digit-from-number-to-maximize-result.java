class Solution {
    public String removeDigit(final String number, final char digit) {
        final char[] digits = number.toCharArray();
        int idx = 0;

        for(int i = 0; i < digits.length; ++i) {
            if(digits[i] == digit) {
                idx = i;

                if(i < digits.length - 1 && digits[i] < digits[i + 1])
                    break;
            }
        }

        return number.substring(0, idx) + number.substring(idx + 1);
    }
}