import java.util.TreeSet;
import java.util.Set;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] inputCount = new int[10];
        for (int d : digits) {
            inputCount[d]++;
        }
        
        Set<Integer> result = new TreeSet<>();
        
        for (int num = 100; num < 1000; num += 2) {
            int[] tempCount = new int[10];
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int units = num % 10;
            
            tempCount[hundreds]++;
            tempCount[tens]++;
            tempCount[units]++;
            
            boolean valid = true;
            for (int d = 0; d < 10; d++) {
                if (tempCount[d] > inputCount[d]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(num);
            }
        }
        
        int[] res = new int[result.size()];
        int i = 0;
        for (int num : result) {
            res[i++] = num;
        }
        return res;
    }
}
