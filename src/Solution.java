class Solution {
    public int myAtoi(String str) {
        return (int)stringToInteger(str);
    }
    public static boolean ifConversionPossible(String s) {
        char firstNonWhiteSpaceChar = findNonWhiteSpaceChar(s);
        if (firstNonWhiteSpaceChar != '-' && firstNonWhiteSpaceChar != '+' && !(firstNonWhiteSpaceChar >= '0' && firstNonWhiteSpaceChar <= '9'))
            return false;
        return true;
    }

    public static char findNonWhiteSpaceChar(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                return s.charAt(i);
            }
            i++;
        }
        return 'f';
    }

    public static long convertToInt(String s, int index) {
        char flag = '+';
        if(findNonWhiteSpaceChar(s)=='-')
            flag = '-';
        int i = index;
        long result = 0;
        while(i < s.length() && s.charAt(i)>='0'&&s.charAt(i)<='9'){
            result = result * 10 + s.charAt(i)-'0';
            i++;
        }
        return flag=='+'?result:-result;
    }

    public static long stringToInteger(String s) {
        long answer = 0;
        if (ifConversionPossible(s)) {
            answer = convertToInt(s, findDigitIndex(s));
        }
        return isInIntRange(answer) ? answer : Integer.MIN_VALUE;
    }

    public static boolean isInIntRange(long answer) {
        return answer <= Integer.MAX_VALUE && answer >= Integer.MIN_VALUE;
    }

    public static int findDigitIndex(String s) {
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                return i;
            i++;
        }
        return s.length();
    }
}