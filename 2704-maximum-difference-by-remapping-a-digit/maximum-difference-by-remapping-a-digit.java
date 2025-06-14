class Solution {
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);

        // --- Find the maximum value ---
        char[] maxArr = str.toCharArray();
        char toReplaceMax = 0;
        for (char c : maxArr) {
            if (c != '9') {
                toReplaceMax = c;
                break;
            }
        }
        if (toReplaceMax != 0) {
            for (int i = 0; i < maxArr.length; i++) {
                if (maxArr[i] == toReplaceMax) {
                    maxArr[i] = '9';
                }
            }
        }
        int max = Integer.parseInt(new String(maxArr));

        // --- Find the minimum value ---
        char[] minArr = str.toCharArray();
        char toReplaceMin = 0;
        for (char c : minArr) {
            if (c != '0') {
                toReplaceMin = c;
                break;
            }
        }
        if (toReplaceMin != 0) {
            for (int i = 0; i < minArr.length; i++) {
                if (minArr[i] == toReplaceMin) {
                    minArr[i] = '0';
                }
            }
        }
        int min = Integer.parseInt(new String(minArr));

        return max - min;
    }
}
