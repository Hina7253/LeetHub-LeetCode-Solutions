class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) 
        return 0;

        int i = 0;
        boolean neg = false;
        long ans = 0;

        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            neg = s.charAt(i) == '-';
            i++;
        }

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') break;

            int digit = ch - '0';
            ans = ans * 10 + digit;

            if (!neg && ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if (neg && -ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return neg ? (int)-ans : (int)ans;
    }
}
